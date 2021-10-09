package br.unicesumar.adsis4s2021.meu.lucas.cidade;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;

@Entity
public class MinhaCidade extends MeuBaseEntity {
	private String nome;
	
	public MinhaCidade() {
	}
	
	public MinhaCidade(String id, String nome) {
		super(id);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
