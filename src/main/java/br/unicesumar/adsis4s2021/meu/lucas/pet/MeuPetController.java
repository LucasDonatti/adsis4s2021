package br.unicesumar.adsis4s2021.meu.lucas.pet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseController;

@RestController
@RequestMapping("/meus-pets")
public class MeuPetController extends MeuBaseController<MeuPet, MeuPetRepository, MeuPetService> {

}
