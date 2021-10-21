package br.unicesumar.adsis4s2021.meu.lucas.pedido;

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

import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuPedidoDTO;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuTotalVendidoDoProdutoDTO;

@RestController
@RequestMapping("/meus-pedidos")
public class MeuPedidoController {

	@Autowired
	private MeuPedidoService service;
	
	@GetMapping
	public List<MeuPedido> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/dto")
	public List<MeuPedidoDTO> getAllDTO() {
		return service.getAllDTO();
	}
	
	@PostMapping
	public String post(@RequestBody MeuPedido novo) {
		return service.insert(novo);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	
	@GetMapping("/meu-total-vendido-por-produto")
	public List<Map<String, Object>> getMeuTotalVendidoPorProduto() {
		return service.consultarMeuTotalVendidoPorProduto();
	}
	
	@GetMapping("/meu-total-vendido-por-produto-DTO")
	public List<MeuTotalVendidoDoProdutoDTO> getMeuTotalVendidoPorProdutoDTO() {
		return service.consultarMeuTotalVendidoPorProdutoDTO();
	}
	
}
