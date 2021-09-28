package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.musica.Musica;

@Entity
public class Album extends PlaylistBaseEntity{
	private String nome;
	private int quantidadeMusicas;
	private String duracao;
	private Date lancamento;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "album_id")
	private List<Musica> musicas;
	
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
	public List<Musica> getMusicas() {
		return musicas;
	}
}
