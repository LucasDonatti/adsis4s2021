package br.unicesumar.adsis4s2021.meu.lucas.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.unicesumar.adsis4s2021.meu.lucas.base.exception.MeuConflictException;
import br.unicesumar.adsis4s2021.meu.lucas.base.exception.MeuNotFoundException;

public class MeuBaseService<ENTITY extends MeuBaseEntity, 
							REPOSITORY extends JpaRepository<ENTITY, String>> {
	
	@Autowired
	private REPOSITORY repo;
	
	public List<ENTITY> obterTodos() {
		return repo.findAll();
	}
	
	public ENTITY obterPeloId(String id) {
		if (!repo.findById(id).isPresent()) 
			throw new MeuNotFoundException("ID informado não consta no banco de dados!");
		return repo.findById(id).get();
	}
	
	public String criar(ENTITY novo) {
		if (repo.findById(novo.getId()).isPresent()) 
			throw new MeuConflictException("Seu registro já existe, faça um put ao invés de post!");
		novo = repo.save(novo);
		return novo.getId();
	}
	
	public void atualizar(ENTITY modificado) {
		if (!repo.findById(modificado.getId()).isPresent()) 
			throw new MeuNotFoundException("Seu registro não existe, faça um post ao invés de put!");
		repo.save(modificado);
	}
	
	public void excluir(String id) {
		if(!repo.findById(id).isPresent())
			throw new MeuNotFoundException("ID informado não consta no banco de dados!");
		repo.deleteById(id);
	}
	
}
