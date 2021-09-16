package br.unicesumar.adsis4s2021.meu.lucas.ato4.cidade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.ato4.base.MeuBaseController;

@RestController
@RequestMapping("/minhas-cidades")
public class MinhaCidadeController extends MeuBaseController<MinhaCidade, MinhaCidadeRepository> {

}
