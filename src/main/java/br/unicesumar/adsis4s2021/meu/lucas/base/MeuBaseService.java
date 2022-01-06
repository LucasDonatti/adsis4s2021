package br.unicesumar.adsis4s2021.meu.lucas.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class MeuBaseService<ENTITY extends MeuBaseEntity, REPOSITORY extends JpaRepository<ENTITY, String>> {
	
	@Autowired
	private REPOSITORY repo;
	
	public List<ENTITY> obterTodos() {
		return repo.findAll();
	}
	
	public ENTITY obterPeloId(String id) {
		return repo.findById(id).get();
	}
	
	public String criar(ENTITY novo) {
		novo = repo.save(novo);
		return novo.getId();
	}
	
	public void atualizar(ENTITY modificado) {
		repo.save(modificado);
	}
	
	public void excluir(String id) {
		repo.deleteById(id);
	}
	
}
