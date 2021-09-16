package br.unicesumar.adsis4s2021.meu.lucas.ato4.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MeuProdutoRepository extends JpaRepository<MeuProduto, String> {
	
	//                                                     : <valor do parâmetro do método>
	@Query("select mp from MeuProduto mp where mp.preco >= :preco")
	List<MeuProduto> recuperarPrecoMaiorQue(double preco);
	
	@Query(value = "select mp.nome, mp.id, mp.preco from MeuProduto mp where mp.preco >= :preco", nativeQuery = true)
	List<MeuProduto> recuperarPrecoMaiorQueViaSQL(double preco);
}
