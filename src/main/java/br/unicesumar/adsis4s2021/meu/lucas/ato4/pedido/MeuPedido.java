package br.unicesumar.adsis4s2021.meu.lucas.ato4.pedido;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.ato4.pessoa.MinhaPessoa;

@Entity
public class MeuPedido {
	@Id
	private String id;
	private Long numero;
	private Date emitidoEm;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="meu_pedido_id")
	private List<MeuItemPedido> itens;
	
	// 1 [-cliente] ----------------------------------> 0..n [-pedidos]
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cliente_id")
	private MinhaPessoa cliente;
	
	public MeuPedido() {
	}
	
	public String getId() {
		return id;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public Date getEmitidoEm() {
		return emitidoEm;
	}
	
	public List<MeuItemPedido> getItens() {
		return itens;
	}
	
}
