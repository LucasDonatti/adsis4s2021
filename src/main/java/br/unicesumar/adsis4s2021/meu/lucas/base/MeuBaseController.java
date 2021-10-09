package br.unicesumar.adsis4s2021.meu.lucas.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MeuBaseController<ENTITY extends MeuBaseEntity, REPO extends JpaRepository<ENTITY, String>> {
	@Autowired
	private REPO repo;
	
	@GetMapping("/{id}")
	public ENTITY get(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@GetMapping
	public List<ENTITY> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody ENTITY novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			throw new RuntimeException("Seu registro já existe, faça um put ao invés de post!");
		}
		novo = repo.save(novo);
		return novo.getId();
	}
	
//	@PostMapping
//	public List<ENTITY> postAll(@RequestBody List<ENTITY> novos) {
//		return repo.saveAll(novos);
//	}
	
	@PutMapping("/{id}")
	public String put(@RequestBody ENTITY modificado, @PathVariable("id") String id) {
		if (!modificado.getId().equals(id)) {
			throw new RuntimeException("Para atualizar um registro, os IDs do request devem ser iguais!");
		}
		if (!repo.findById(id).isPresent()) {
			throw new RuntimeException("Seu registro não existe, faça um post ao invés de put!");
		}
		modificado = repo.save(modificado);
		return modificado.getId();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

}
