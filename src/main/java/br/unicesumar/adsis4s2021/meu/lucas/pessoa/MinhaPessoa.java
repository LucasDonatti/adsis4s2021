package br.unicesumar.adsis4s2021.meu.lucas.pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.unicesumar.adsis4s2021.meu.lucas.base.MeuBaseEntity;

@Entity
public class MinhaPessoa extends MeuBaseEntity {
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="meu_morador_id")
	private List<MeuEndereco> enderecos = new ArrayList<>();
	
	public MinhaPessoa() {
	}
	
	public MinhaPessoa(String id, String nome) {
		super(id);
		this.nome = nome;
	}

	public String getNome() {
		return nome; 
	} 

	public List<MeuEndereco> getEnderecos() {
		return enderecos;
	}
	
}
