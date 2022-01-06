package br.unicesumar.adsis4s2021.meu.lucas.categoria;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;

@Entity
public class MinhaCategoria extends MeuBaseEntity {

	private String nome;

	public String getNome() {
		return nome;
	}

}
