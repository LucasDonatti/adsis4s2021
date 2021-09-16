package br.unicesumar.adsis4s2021.meu.lucas.ato4.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String postMeuProduto(@RequestBody MeuProduto novo) {
		if(repo.findById(novo.getId()).isPresent()) {
			throw new RuntimeException("Seu produto já existe, faça um PUT se quiser altera-lo");
		}
		novo = repo.save(novo);
		return novo.getId();
	}
	
	@PutMapping("/{id}")
	public String putMeuProduto(@RequestBody MeuProduto modificado, @PathVariable("id") String id) {
		if(!modificado.getId().equals(id)) {
			throw new RuntimeException("Para atualizar um produto os IDs do request devem ser iguais");
		}
		if(!repo.findById(id).isPresent()) {
			throw new RuntimeException("Seu produto não existe, faça um POST ao invés de PUT");
		}
		modificado = repo.save(modificado);
		return modificado.getId();
	}
	
}
