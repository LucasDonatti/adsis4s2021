package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.musica;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseController;
import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.dto.MusicaDTO;

@RestController
@RequestMapping("musicas")
public class MusicaController extends PlaylistBaseController<Musica, MusicaRepository>{
	
	@GetMapping("musicas-DTO")
	public List<MusicaDTO> getMusicasDTO(){
		return repo.encontrarMusicasDTO();
	}
	
}