package br.unicesumar.adsis4s2021.meu.lucas.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseController;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuPedidoDTO;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuTotalVendidoDoProdutoDTO;

@RestController
@RequestMapping("/meus-pedidos")
public class MeuPedidoController extends MeuBaseController<MeuPedido, MeuPedidoRepository, MeuPedidoService> {

	@Autowired
	private MeuPedidoService service;
	
	@GetMapping("/dto")
	public List<MeuPedidoDTO> getAllDTO() {
		return service.obterTodosDTO();
	}
	
	@PostMapping
	public String post(@RequestBody MeuPedido novo) {
		return service.criar(novo);
	}
	
	@GetMapping("/meu-total-vendido-por-produto-dto")
	public List<MeuTotalVendidoDoProdutoDTO> getMeuTotalVendidoPorProdutoDTO() {
		return service.consultarMeuTotalVendidoPorProdutoDTO();
	}
	
}
