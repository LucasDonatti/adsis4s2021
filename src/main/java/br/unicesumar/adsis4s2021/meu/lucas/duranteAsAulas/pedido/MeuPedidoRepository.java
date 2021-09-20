package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.pedido;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.pedido.dto.MeuTotalVendidoDoProdutoDTO;

public interface MeuPedidoRepository extends JpaRepository<MeuPedido, String> {

	// Usado em um get no MeuPedidoController p/ retornar o nome do produto e o total vendido
	@Query(value = "select p.nome as produto, "
			+ "sum(mip.quantidade * mip.precoUnitario) as totalVendido "
			+ "from MeuItemPedido mip "
			+ "inner join mip.produto p "
			+ "group by p.nome")
	List<Map<String, Object>> consultarMeuTotalVendidoPorProduto();
	
	// Uso do DTO MeuTotalVendidoDoProdutoDTO para armazenar o resultado da query, 
	// e tbm é aplicado num get em MeuPedidoController
	@Query(value = "select new br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.pedido.dto.MeuTotalVendidoDoProdutoDTO(p.nome, "
			+ "sum(mip.quantidade * mip.precoUnitario)) "
			+ "from MeuItemPedido mip "
			+ "inner join mip.produto p "
			+ "group by p.nome")
	List<MeuTotalVendidoDoProdutoDTO> consultarMeuTotalVendidoPorProdutoDTO();
	
}
