package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.produto;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meus-produtos")
public class MeuProdutoController {
	@Autowired
	private MeuProdutoRepository repo;
	
	@GetMapping("/meu-com-preco-maior-que")
	public List<MeuProduto> getComPrecoMaiorQue(@RequestParam double preco){
		return repo.recuperarPrecoMaiorQue(preco);
		//return repo.recuperarPrecoMaiorQueViaSQL(preco);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMeuProduto(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public MeuProduto getMeuProduto(@PathVariable("id") String id){
		return repo.findById(id).get();
	}
	
	@GetMapping
	public List<MeuProduto> getMeusProdutos(){
		return repo.findAll();
	}
	
	@PostMapping
	//.................................201 == CREATED
	//@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<String> postMeuProduto(@RequestBody MeuProduto novo) {
		if(repo.findById(novo.getId()).isPresent()) {
			//......................................409 == CONFLICT
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Seu produto já existe, faça um PUT se quiser altera-lo");
		}
		novo = repo.save(novo);
		//......................................201 == CREATED
		return ResponseEntity.status(HttpStatus.CREATED).body(novo.getId());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> putMeuProduto(@RequestBody MeuProduto modificado, @PathVariable("id") String id) {
		if(!modificado.getId().equals(id)) {
			//......................................409 == CONFLICT
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Para atualizar um produto os IDs do request devem ser iguais");
		}
		if(!repo.findById(id).isPresent()) {
			//......................................404 == NOT_FOUND
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Seu produto não existe, faça um POST ao invés de PUT");
		}
		modificado = repo.save(modificado);
		//......................................200 == OK
		return ResponseEntity.status(HttpStatus.OK).body(modificado.getId());
	}
	
}
