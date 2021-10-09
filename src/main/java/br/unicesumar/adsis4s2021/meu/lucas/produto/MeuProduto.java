package br.unicesumar.adsis4s2021.meu.lucas.produto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.categoria.MinhaCategoria;

@Entity
public class MeuProduto {
	@Id
	private String id;
	private String nome;
	private double preco;
	
	// Muitos produtos tem uma categoria
	@ManyToOne
	@JoinColumn(name="minha_categoria_id")
	private MinhaCategoria categoria;
	
	public MeuProduto() {
	}
	
	public MeuProduto(String id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	
	public MinhaCategoria getCategoria() {
		return categoria;
	}
}
