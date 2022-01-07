package br.unicesumar.adsis4s2021.meu.lucas.produto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.categoria.MinhaCategoria;
import br.unicesumar.adsis4s2021.meu.lucas.estoque.MinhaReservaDeEstoque;

@Entity
public class MeuProduto extends MeuBaseEntity {
	
	private String nome;
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "minha_categoria_id")
	private MinhaCategoria categoria;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MinhaReservaDeEstoque> reservasDeEstoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public MinhaCategoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(MinhaCategoria categoria) {
		this.categoria = categoria;
	}
	
}
