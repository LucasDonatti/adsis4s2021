package br.unicesumar.adsis4s2021.meu.lucas.ato4.pessoa;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.ato4.base.MeuBaseEntity;

@Entity
public class MinhaPessoa extends MeuBaseEntity {
	private String nome;
	
	public MinhaPessoa() {
	}
	
	public MinhaPessoa(String id, String nome) {
		super(id);
		this.nome = nome;
	}

	public String getNome() {
		return nome; 
	} 

}
