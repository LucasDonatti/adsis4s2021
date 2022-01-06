package br.unicesumar.adsis4s2021.meu.lucas.pessoa;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.cidade.MinhaCidade;

@Entity
public class MeuEndereco extends MeuBaseEntity {
	
	private String logradouro;
	private String numero;
	private String bairro;
	
	@ManyToOne
	private MinhaCidade cidade;
	
	public MeuEndereco() {
		super();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public MinhaCidade getCidade() {
		return cidade;
	}

	public void setCidade(MinhaCidade cidade) {
		this.cidade = cidade;
	}
	
}
