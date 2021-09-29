package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseController;

@RestController
@RequestMapping("albuns")
public class AlbumController extends PlaylistBaseController<Album, AlbumRepository> {
	
	@GetMapping("/dto")
	public List<AlbumDTO> getAlbumDTO() {
		return repo.encontrarAlbumDTO();
	}
	
}
