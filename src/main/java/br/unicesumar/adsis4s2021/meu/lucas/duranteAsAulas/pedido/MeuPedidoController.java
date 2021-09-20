package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.pedido;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.pedido.dto.MeuTotalVendidoDoProdutoDTO;

@RestController
@RequestMapping("/meus-pedidos")
public class MeuPedidoController {
	
	@Autowired
	private MeuPedidoRepository repo;
	
	@DeleteMapping("/{id}")
	public void deleteMeuProduto(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
	
	@GetMapping
	public List<MeuPedido> getMeusProdutos(){
		return repo.findAll();
	}
	
	@PostMapping
	public String postMeuPedido(@RequestBody MeuPedido novo) {
		if(repo.findById(novo.getId()).isPresent()) {
			throw new RuntimeException("Seu pedido já existe, faça um PUT se quiser altera-lo");
		}
		novo = repo.save(novo);
		return novo.getId();
	}
	
	// Query consultarTotalVendidoPorProduto em MeuPedidoRepository
	@GetMapping("/meu-total-vendido-por-produto")
	public List<Map<String, Object>> getMeuTotalVendidoPorProduto() {
		return repo.consultarMeuTotalVendidoPorProduto();
	}

	// Query consultarTotalVendidoPorProdutoDTO em MeuPedidoRepository
	@GetMapping("/meu-total-vendido-por-produto-DTO")
	public List<MeuTotalVendidoDoProdutoDTO> getTotalVendidoPorProdutoDTO() {
		return repo.consultarMeuTotalVendidoPorProdutoDTO();
	}
	
}
