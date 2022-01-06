package br.unicesumar.adsis4s2021.meu.lucas.pet;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseService;

@Service
@Transactional
public class MeuPetService extends MeuBaseService<MeuPet, MeuPetRepository> {

}
