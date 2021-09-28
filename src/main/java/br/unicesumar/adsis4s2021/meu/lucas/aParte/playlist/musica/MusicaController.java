package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.musica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseController;

@RestController
@RequestMapping("musicas")
public class MusicaController extends PlaylistBaseController<Musica, MusicaRepository>{
	
}