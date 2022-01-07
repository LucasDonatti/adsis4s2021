package br.unicesumar.adsis4s2021.meu.lucas.produto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseService;

@Service
@Transactional
public class MeuProdutoService extends MeuBaseService<MeuProduto, MeuProdutoRepository> {

	@Autowired
	private MeuProdutoRepository repo;
	
	public List<MeuProduto> recuperarPrecoMaiorQue(double preco) {
		return repo.recuperarPrecoMaiorQue(preco);
	}

}
