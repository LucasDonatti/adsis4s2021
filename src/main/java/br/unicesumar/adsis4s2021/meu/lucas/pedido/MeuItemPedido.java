package br.unicesumar.adsis4s2021.meu.lucas.pedido;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.produto.MeuProduto;

@Entity
public class MeuItemPedido extends MeuBaseEntity {
	
	private BigDecimal precoUnitario;
	private BigDecimal percentualDeDesconto;
	private BigDecimal quantidade;
	
	@ManyToOne
	@JoinColumn(name="meu_produto_id")
	private MeuProduto produto;

	public BigDecimal getPercentualDeDesconto() {
		return percentualDeDesconto;
	}
	
	public void setPercentualDeDesconto(BigDecimal percentualDeDesconto) {
		this.percentualDeDesconto = percentualDeDesconto;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	
	public MeuProduto getProduto() {
		return produto;
	}

	public void setProduto(MeuProduto produto) {
		this.produto = produto;
	}
	
}
