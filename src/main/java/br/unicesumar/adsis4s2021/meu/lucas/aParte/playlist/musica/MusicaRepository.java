package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.musica;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.dto.MusicaDTO;

public interface MusicaRepository extends JpaRepository<Musica, String> {

	@Query(value = "select new br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.dto.MusicaDTO("
			+ "m.id, m.nome, m.duracao, m.faixa, ab.id, ab.nome, at.id, at.nome) "
			+ "from Musica m "
			+ "inner join m.album ab "
			+ "inner join m.artista at")
	List<MusicaDTO> encontrarMusicasDTO();
	
}