package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlbumRepository extends JpaRepository<Album, String> {

	@Query(value = "select new br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album.AlbumDTO("
			+ "id, nome, quantidadeMusicas, duracao, lancamento) from Album")
	List<AlbumDTO> encontrarAlbumDTO();
	
}
