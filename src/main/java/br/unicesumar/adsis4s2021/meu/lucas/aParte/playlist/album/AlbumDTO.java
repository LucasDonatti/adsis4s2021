package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album;

import java.util.Date;

public class AlbumDTO {
	private String id;
	private String nome;
	private int quantidadeMusicas;
	private String duracao;
	private Date lancamento;
	
	public AlbumDTO (String id, String nome, int quantidadeMusicas, String duracao, Date lancamento) {
		this.id = id;
		this.nome = nome;
		this.quantidadeMusicas = quantidadeMusicas;
		this.duracao = duracao;
		this.lancamento = lancamento;
	}
	
	public String getId() {
		return id;
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
	
	
	
}
