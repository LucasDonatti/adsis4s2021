package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.musica;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album.Album;
import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.artista.Artista;
import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseEntity;

@Entity
public class Musica extends PlaylistBaseEntity{
	private String nome;
	private String duracao;
	private int faixa;
	
	@ManyToOne // add cascade para deletar as musicas quando o album for deletado
	@JoinColumn(name = "album_id")
	private Album album;
	
	@ManyToOne // add cascade para deletar as musicas quando o artista for deletado
	@JoinColumn(name = "artista_id")
	private Artista artista;
	
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
	public Album getAlbum() {
		return album;
	}
	public Artista getArtista() {
		return artista;
	}
}