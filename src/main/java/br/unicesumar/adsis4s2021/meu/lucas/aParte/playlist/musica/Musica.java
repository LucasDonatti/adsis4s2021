package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.musica;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseEntity;

@Entity
public class Musica extends PlaylistBaseEntity{
	private String nome;
	private String duracao;
	private int faixa;
	
	public Musica() {
	}

	public String getNome() {
		return nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public int getFaixa() {
		return faixa;
	}
}