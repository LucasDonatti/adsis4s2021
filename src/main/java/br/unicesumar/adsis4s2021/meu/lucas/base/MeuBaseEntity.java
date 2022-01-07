package br.unicesumar.adsis4s2021.meu.lucas.base;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MeuBaseEntity {
	
	@Id
	private String id;
	
	public MeuBaseEntity() {
		this.id = UUID.randomUUID().toString();
	}
	
	public MeuBaseEntity(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeuBaseEntity other = (MeuBaseEntity) obj;
		return Objects.equals(id, other.id);
	}

}
