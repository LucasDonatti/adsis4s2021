package br.unicesumar.adsis4s2021.meu.lucas.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MeuBaseController<ENTITY extends MeuBaseEntity, 
							   REPOSITORY extends JpaRepository<ENTITY, String>, 
							   SERVICE extends MeuBaseService<ENTITY, REPOSITORY>> {
	
	@Autowired
	private SERVICE service;
	
	@GetMapping
	public List<ENTITY> getAll() {
		return service.obterTodos();
	}
	
	@GetMapping("/{id}")
	public ENTITY get(@PathVariable("id") String id) {
		return service.obterPeloId(id);
	}
	
	@PostMapping
	public String post(@RequestBody ENTITY novo) {
		return service.criar(novo);
	}
	
	@PutMapping("/{id}")
	public void put(@RequestBody ENTITY modificado, @PathVariable("id") String id) {
		if (!modificado.getId().equals(id)) 
			throw new RuntimeException("Para atualizar um registro, os IDs do request devem ser iguais!");
		service.atualizar(modificado);
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		service.excluir(id);
	}

}
