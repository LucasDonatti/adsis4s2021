package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.dto;

public class MusicaDTO {
	private String id;
	private String nome;
	private String duracao;
	private int faixa;
	private String albumId;
	private String albumNome;
	private String artistaId;
	private String artistaNome;
	
	public MusicaDTO(String id, String nome, String duracao, int faixa,
					 String albumId, String albumNome, 
					 String artistaId, String artistaNome) {
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.faixa = faixa;
		this.albumId = albumId;
		this.albumNome = albumNome;
		this.artistaId = artistaId;
		this.artistaNome = artistaNome;
	}
	
	public String getId() {
		return id;
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
	public String getAlbumId() {
		return albumId;
	}
	public String getAlbumNome() {
		return albumNome;
	}
	public String getArtistaId() {
		return artistaId;
	}
	public String getArtistaNome() {
		return artistaNome;
	}
	
}
