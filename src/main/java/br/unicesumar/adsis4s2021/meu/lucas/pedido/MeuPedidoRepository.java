package br.unicesumar.adsis4s2021.meu.lucas.pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuItemPedidoDTO;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuPedidoDTO;
import br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuTotalVendidoDoProdutoDTO;

public interface MeuPedidoRepository extends JpaRepository<MeuPedido, String> {
	
	@Query(value = "select new br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuTotalVendidoDoProdutoDTO(p.nome, sum(mip.quantidade * mip.precoUnitario)) "
			+ "       from MeuItemPedido mip "
			+ " inner join mip.produto p "
			+ "   group by p.nome")
	List<MeuTotalVendidoDoProdutoDTO> consultarMeuTotalVendidoPorProdutoDTO();
	
	@Query(value = "select new br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuPedidoDTO(mp.id, mp.numero, mp.emitidoEm, mc.id, mc.nome) "
			+ "       from MeuPedido mp "
			+ " inner join mp.cliente mc")
	List<MeuPedidoDTO> encontrarPedidoComoDTO();
	
	@Query(value = "select new br.unicesumar.adsis4s2021.meu.lucas.pedido.dto.MeuItemPedidoDTO(mip.id, mip.precoUnitario, mip.percentualDeDesconto, mip.quantidade, mp.id, mp.nome) "
			+ "       from MeuItemPedido mip "
			+ " inner join mip.produto mp "
			+ "      where mip.id = :pedidoId")
	List<MeuItemPedidoDTO> encontrarItemPedidoComoDTO(String pedidoId);
	
}
