package br.unicesumar.adsis4s2021.meu.lucas.duranteAsAulas.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lucas-controller")
public class LucasController {
	
	@GetMapping
	public String get() {
		return "Olha, o lucas-controller está funcionando!";
	}
	
}
