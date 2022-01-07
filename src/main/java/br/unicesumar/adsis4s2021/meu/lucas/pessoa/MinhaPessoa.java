package br.unicesumar.adsis4s2021.meu.lucas.pessoa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;
import br.unicesumar.adsis4s2021.meu.lucas.estoque.MinhaReservaDeEstoque;

@Entity
public class MinhaPessoa extends MeuBaseEntity {
	
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "meu_morador_id")
	private List<MeuEndereco> enderecos;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<MinhaReservaDeEstoque> reservasDeEstoque;

	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<MeuEndereco> getEnderecos() {
		return enderecos;
	}
	
	public void setEnderecos(List<MeuEndereco> enderecos) {
		this.enderecos = enderecos;
	}
	
}
