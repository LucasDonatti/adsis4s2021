package br.unicesumar.adsis4s2021.meu.lucas.ato4.pedido;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.ato4.produto.MeuProduto;

@Entity
public class MeuItemPedido {
	@Id
	private String id;
	private BigDecimal precoUnitario;
	private BigDecimal percentualDeDesconto;
	private BigDecimal quantidade;
	
	@ManyToOne
	private MeuProduto produto;
	
	public MeuItemPedido() {
	}
	
	public String getId() {
		return id;
	}
	
	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	
	public BigDecimal getPercentualDeDesconto() {
		return percentualDeDesconto;
	}
	
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	
	public MeuProduto getMeuProduto() {
		return produto;
	}
	
}
