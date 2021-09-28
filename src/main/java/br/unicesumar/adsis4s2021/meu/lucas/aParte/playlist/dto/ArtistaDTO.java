package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.dto;

import java.util.List;

public class ArtistaDTO {
	private String id;
	private String nome;
	private List<AlbumDTO> albuns;
	
	public ArtistaDTO(String id, String nome, List<AlbumDTO> albuns) {
		this.id = id;
		this.nome = nome;
		this.albuns = albuns;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public List<AlbumDTO> getAlbuns() {
		return albuns;
	}
	
	
}
