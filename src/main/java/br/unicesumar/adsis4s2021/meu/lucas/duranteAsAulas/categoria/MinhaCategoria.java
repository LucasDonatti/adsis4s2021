package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.categoria;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.base.MeuBaseEntity;

@Entity
public class MinhaCategoria extends MeuBaseEntity {
	private String nome;
	
	public MinhaCategoria() {
	}
	
	public MinhaCategoria(String id, String nome) {
		super(id);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
