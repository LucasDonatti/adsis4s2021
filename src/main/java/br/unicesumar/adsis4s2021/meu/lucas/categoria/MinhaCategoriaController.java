package br.unicesumar.adsis4s2021.meu.lucas.categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseController;

@RestController
@RequestMapping("/minhas-categorias")
public class MinhaCategoriaController extends MeuBaseController<MinhaCategoria, MinhaCategoriaRepository, MinhaCategoriaService> {

}
