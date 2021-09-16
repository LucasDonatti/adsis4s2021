package br.unicesumar.adsis4s2021.meu.lucas.ato4.cidade;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.unicesumar.adsis4s2021.meu.lucas.ato4.base.MeuBaseEntity;

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
