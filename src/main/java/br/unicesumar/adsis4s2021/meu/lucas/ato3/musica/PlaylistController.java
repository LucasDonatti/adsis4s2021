package br.unicesumar.adsis4s2021.meu.lucas.ato3.musica;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playlist")
public class PlaylistController {
	private Set<Playlist> playlist = new HashSet<>();
	
	public PlaylistController() {
		playlist.add(new Playlist(1,"Primus","Sailing The Seas Of Cheese","Jerry Was A Race Car Driver"));
		playlist.add(new Playlist(2,"King Crimson","Red","Starless"));
		playlist.add(new Playlist(3,"Gentle Giant","The Power And The Glory","Valedictory"));
	}
	
	@PostMapping
	public void postMusica(@RequestBody Playlist musica) {
		playlist.add(musica);
	}
	
	@GetMapping
	public Set<Playlist> getPlaylist(){
		return this.playlist;
	}
	
	@GetMapping("/{ordemDeReproducao}")
	public Playlist getMusicaPelaOrdemDeReproducao(@PathVariable("ordemDeReproducao") int ordemDeReproducao) {
		for(Playlist musica : playlist) {
			if(musica.getOrdemDeReproducao() == ordemDeReproducao) {
				return musica;
			}
		}
		return null;
	}
	
	@DeleteMapping("/{ordemDeReproducao}")
	public void deleteMusicaPelaOrdemDeReproducao(@PathVariable("ordemDeReproducao") int ordemDeReproducao) {
		Playlist musicaParaRemover = null;
		for(Playlist musica : playlist) {
			if(musica.getOrdemDeReproducao() == ordemDeReproducao) {
				musicaParaRemover = musica;
				break;
			}
		}
		if(musicaParaRemover != null) {
			playlist.remove(musicaParaRemover);
		}
	}
	
}
