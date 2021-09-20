package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.cor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cores")
public class CorController {
	private List<Cor> cores = new ArrayList<Cor>();
	
	public CorController() {
		this.cores.add(new Cor("Preto", "BLK"));
		this.cores.add(new Cor("Azul", "BLE"));
		this.cores.add(new Cor("Roxo", "PRPL"));
	}
	
	@GetMapping
	public List<Cor> getCores(){
		return this.cores;
	}
	
	@GetMapping("/{sigla}")
	public Cor getCorPelaSigla(@PathVariable("sigla") String sigla){
		//System.out.println(">>>> sigla: " + sigla);
		for (Cor c : cores) {
			if (c.getSigla().equalsIgnoreCase(sigla)) {
				return c;
			}
		}
		return null;
	}
	
	@PostMapping
	public void postCor(@RequestBody Cor nova){
		// Código para realizar o post pelo terminal
		// curl -d '{"nome":"Nova","sigla":"NV"}' -H "Content-Type: application/json" -X POST localhost:9095/cores
		this.cores.add(nova);
	}
	
	@DeleteMapping("/{sigla}")
	public void deleteCorPelaSigla(@PathVariable("sigla") String sigla) {
		Cor corParaRemover = null;
		for (Cor c : cores) {
			if (c.getSigla().equalsIgnoreCase(sigla)) {
				corParaRemover = c;
				break;
			}
		}
		
		if (corParaRemover != null) {
			cores.remove(corParaRemover);
		}
	}
	
	@PutMapping("/{sigla}")
	public void updateCorPelaSigla(
			@PathVariable("sigla") String sigla,
			@RequestBody Cor corAtualizada) {
		
		deleteCorPelaSigla(sigla);
		this.cores.add(corAtualizada);
		
	}
	
}
