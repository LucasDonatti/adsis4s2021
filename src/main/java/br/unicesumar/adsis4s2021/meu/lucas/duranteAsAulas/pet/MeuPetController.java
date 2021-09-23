package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meus-pets")
public class MeuPetController {
	@Autowired
	private MeuPetRepository repo;

	@DeleteMapping("/{id}")
	public void deletePeloId(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public MeuPet getPeloId(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@GetMapping
	public List<MeuPet> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public ResponseEntity<String> post(@RequestBody MeuPet novo) {
		if (repo.findById(novo.getId()).isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Seu pet já existe, faça um put ao invés de post!");
		}
		novo = repo.save(novo);
		return ResponseEntity.status(HttpStatus.CREATED).body(novo.getId());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> putPeloId(@RequestBody MeuPet modificado, @PathVariable("id") String id) {
		if (!modificado.getId().equals(id)) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Para atualizar um pet, os IDs do request devem ser iguais!");
		}
		if (!repo.findById(id).isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Seu pet não existe, faça um post ao invés de put!");
		}
		modificado = repo.save(modificado);
		return ResponseEntity.status(HttpStatus.OK).body(modificado.getId());
	}
	
}
