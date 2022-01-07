package br.unicesumar.adsis4s2021.meu.lucas.pedido;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseService;
import br.unicesumar.adsis4s2021.meu.lucas.estoque.MinhaReservaDeEstoque;
import br.unicesumar.adsis4s2021.meu.lucas.estoque.MinhaReservaDeEstoqueService;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuPedidoDTO;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuTotalVendidoDoProdutoDTO;

@Service
@Transactional
public class MeuPedidoService extends MeuBaseService<MeuPedido, MeuPedidoRepository> {
	
	@Autowired
	private MeuPedidoRepository repo;
	
	@Autowired
	private MinhaReservaDeEstoqueService minhaReservaDeEstoqueSevice;
	
	public List<MeuPedidoDTO> obterTodosDTO() {
		List<MeuPedidoDTO> pedidosDTO = repo.encontrarPedidoComoDTO();
		for (MeuPedidoDTO pedidoDTO : pedidosDTO) 
			pedidoDTO.setItens(repo.encontrarItemPedidoComoDTO(pedidoDTO.getId()));
		return pedidosDTO;
	}

	public String criar(MeuPedido novo) {
		if (repo.findById(novo.getId()).isPresent()) 
			throw new RuntimeException("Seu pedido já existe, faça um put ao invés de post!");
		for (MeuItemPedido mip : novo.getItens()) 
			minhaReservaDeEstoqueSevice.insert(new MinhaReservaDeEstoque(novo.getCliente(), new Date(), mip.getProduto(), mip.getQuantidade()));
		novo = repo.save(novo);
		return novo.getId();
	}

	public List<MeuTotalVendidoDoProdutoDTO> consultarMeuTotalVendidoPorProdutoDTO() {
		return repo.consultarMeuTotalVendidoPorProdutoDTO();
	}

}
