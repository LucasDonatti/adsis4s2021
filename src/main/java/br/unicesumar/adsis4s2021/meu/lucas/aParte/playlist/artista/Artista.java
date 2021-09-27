package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.artista;

import javax.persistence.Entity;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseEntity;

@Entity
public class Artista extends PlaylistBaseEntity {
	private String nome;
	
	public Artista() {
	}
	
	public String getNome() {
		return nome;
	}
}
