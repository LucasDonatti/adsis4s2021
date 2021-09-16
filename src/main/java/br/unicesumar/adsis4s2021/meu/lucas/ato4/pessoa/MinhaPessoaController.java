package br.unicesumar.adsis4s2021.meu.lucas.ato4.pessoa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.ato4.base.MeuBaseController;

@RestController
@RequestMapping("/minhas-pessoas")
public class MinhaPessoaController extends MeuBaseController<MinhaPessoa, MinhaPessoaRepository>{

}
