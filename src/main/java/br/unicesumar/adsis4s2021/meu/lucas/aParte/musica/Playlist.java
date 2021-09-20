package br.unicesumar.adsis4s2021.meu.lucas.aParte.musica;

public class Playlist {
	private int ordemDeReproducao;
	private String banda;
	private String album;
	private String musica;
	
	Playlist(int ordemDeReproducao, String banda, String album, String musica) {
		this.ordemDeReproducao = ordemDeReproducao;
		this.banda = banda;
		this.album = album;
		this.musica = musica;
	}
	
	public int getOrdemDeReproducao() {
		return ordemDeReproducao;
	}
	
	public String getBanda() {
		return banda;
	}
	
	public String getMusica() {
		return musica;
	}
	
	public String getAlbum() {
		return album;
	}
}
