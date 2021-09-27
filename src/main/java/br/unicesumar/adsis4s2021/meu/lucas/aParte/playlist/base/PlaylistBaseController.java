package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base;

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

public class PlaylistBaseController<ENTITY extends PlaylistBaseEntity, REPO extends JpaRepository<ENTITY, String>> {
	@Autowired
	protected REPO repo;
	
	@GetMapping
	public List<ENTITY> get() {
		return repo.findAll();
	}
	
	@PostMapping
	public ResponseEntity<String> post(@RequestBody ENTITY nova) {
		repo.save(nova);
		return ResponseEntity.status(HttpStatus.CREATED).body(nova.getId());
	}
	
	@PutMapping("/{id}")
	public String putMusica(@RequestBody ENTITY modificada, @PathVariable String id) {
		modificada = repo.save(modificada);
		return modificada.getId();
	}
	
	@DeleteMapping("/{id}")
	public void deleteMusica(@PathVariable String id) {
		repo.deleteById(id);
	}
}















