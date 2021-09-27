package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PlaylistBaseEntity {
	@Id
	private String id;
	
	public PlaylistBaseEntity() {
		this.id = UUID.randomUUID().toString();
	}
	public PlaylistBaseEntity(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}
