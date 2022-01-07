package br.unicesumar.adsis4s2021.meu.lucas.pedido;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.pessoa.MinhaPessoa;

@Entity
public class MeuPedido extends MeuBaseEntity {
	
	private Long numero;
	private Date emitidoEm;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="meu_pedido_id")
	private List<MeuItemPedido> itens;
	
	@ManyToOne
	@JoinColumn(name="meu_cliente_id")
	private MinhaPessoa cliente;
	
	public Long getNumero() {
		return numero;
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public Date getEmitidoEm() {
		return emitidoEm;
	}
	
	public void setEmitidoEm(Date emitidoEm) {
		this.emitidoEm = emitidoEm;
	}
	
	public List<MeuItemPedido> getItens() {
		return itens;
	}
	
	public void setItens(List<MeuItemPedido> itens) {
		this.itens = itens;
	}
	
	public MinhaPessoa getCliente() {
		return cliente;
	}
	
	public void setCliente(MinhaPessoa cliente) {
		this.cliente = cliente;
	}
	
}
