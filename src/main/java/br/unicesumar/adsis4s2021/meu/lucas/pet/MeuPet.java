package br.unicesumar.adsis4s2021.meu.lucas.pet;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;

@Entity
public class MeuPet extends MeuBaseEntity {
	
	private String nome;

	public String getNome() {
		return nome;
	}
	
}
