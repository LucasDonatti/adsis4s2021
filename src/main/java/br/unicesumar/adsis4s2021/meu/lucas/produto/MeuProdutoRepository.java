package br.unicesumar.adsis4s2021.meu.lucas.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MeuProdutoRepository extends JpaRepository<MeuProduto, String> {
	
	@Query("select mp from MeuProduto mp where mp.preco >= :preco")
	List<MeuProduto> recuperarPrecoMaiorQue(double preco);
	
}
