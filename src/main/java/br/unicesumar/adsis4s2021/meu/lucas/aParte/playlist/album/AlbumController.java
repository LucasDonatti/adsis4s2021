package br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.album;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.adsis4s2021.meu.lucas.aParte.playlist.base.PlaylistBaseController;

@RestController
@RequestMapping("albuns")
public class AlbumController extends PlaylistBaseController<Album, AlbumRepository> {
	
}
