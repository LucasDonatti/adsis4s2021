package br.unicesumar.adsis4s2021.meu.lucas.estoque;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.pessoa.MinhaPessoa;
import br.unicesumar.adsis4s2021.meu.lucas.produto.MeuProduto;

@Entity
public class MinhaReservaDeEstoque extends MeuBaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private MinhaPessoa cliente;
	private Date efetuadaEm;
	
	@ManyToOne
	private MeuProduto produto;
	private BigDecimal quantidade;
	
	public MinhaReservaDeEstoque() {
	}
	
	public MinhaReservaDeEstoque(MinhaPessoa cliente, Date efetuadaEm, MeuProduto produto, BigDecimal quantidade) {
		super();
		this.cliente = cliente;
		this.efetuadaEm = efetuadaEm;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public MinhaPessoa getCliente() {
		return cliente;
	}

	public void setCliente(MinhaPessoa cliente) {
		this.cliente = cliente;
	}

	public Date getEfetuadaEm() {
		return efetuadaEm;
	}

	public void setEfetuadaEm(Date efetuadaEm) {
		this.efetuadaEm = efetuadaEm;
	}

	public MeuProduto getProduto() {
		return produto;
	}

	public void setProduto(MeuProduto produto) {
		this.produto = produto;
	}
	
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	
}
