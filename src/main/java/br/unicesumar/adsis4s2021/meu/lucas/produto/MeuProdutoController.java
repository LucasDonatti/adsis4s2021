package br.unicesumar.adsis4s2021.meu.lucas.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseController;

@RestController
@RequestMapping("/meus-produtos")
public class MeuProdutoController extends MeuBaseController<MeuProduto, MeuProdutoRepository, MeuProdutoService> {
	
	@Autowired
	private MeuProdutoService service;
	
	@GetMapping("/meu-com-preco-maior-que")
	public List<MeuProduto> getComPrecoMaiorQue(@RequestParam double preco){
		return service.recuperarPrecoMaiorQue(preco);
	}
	
}
