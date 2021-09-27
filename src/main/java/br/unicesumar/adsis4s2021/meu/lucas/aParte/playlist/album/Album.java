package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.artista.Artista;
import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseEntity;

@Entity
public class Album extends PlaylistBaseEntity{
	private String nome;
	private int quantidadeMusicas;
	private String duracao;
	private Date lancamento;
	
	@ManyToOne // add cascade para deletar os albuns quando o artista for deletado
	@JoinColumn(name = "artista_id")
	private Artista artista;
	
	public Album() {
	}
	
	public String getNome() {
		return nome;
	}
	public int getQuantidadeMusicas() {
		return quantidadeMusicas;
	}
	public String getDuracao() {
		return duracao;
	}
	public Date getLancamento() {
		return lancamento;
	}
	public Artista getArtista() {
		return artista;
	}
}
