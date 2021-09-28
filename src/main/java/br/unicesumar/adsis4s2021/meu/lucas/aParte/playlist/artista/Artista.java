package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.artista;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album.Album;
import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseEntity;

@Entity
public class Artista extends PlaylistBaseEntity {
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "artista_id")
	private List<Album> albuns;
	
	public Artista() {
	}
	
	public String getNome() {
		return nome;
	}
	public List<Album> getAlbuns() {
		return albuns;
	}
}
