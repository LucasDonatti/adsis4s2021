package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.artista;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseController;

@RestController
@RequestMapping("artistas")
public class ArtistaController extends PlaylistBaseController<Artista, ArtistaRepository>{
	
}
