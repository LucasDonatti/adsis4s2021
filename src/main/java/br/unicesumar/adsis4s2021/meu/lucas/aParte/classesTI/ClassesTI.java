package br.unicesumar.adsis4s2021.meu.lucas.aParte.classesTI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("classes-ti")
public class ClassesTI {
	
	@GetMapping
	public String getClassesTI() {
		return "Classes de TI";
	}
	
	@GetMapping("/dev-software")
	public String getDevSoftware() {
		return "Desenvolvedor de Software";
	}
	
	@GetMapping("/projetista-erp")
	public String getProjetistaERP() {
		return "Projetista de ERP";
	}
	
	@GetMapping("/gestor-informacao")
	public String getGestorInformacao() {
		return "Gestor da Informação";
	}
	
	@GetMapping("/gestor-projetos")
	public String getGestorProjetos() {
		return "Gestor de Projetos";
	}
	
	@GetMapping("/suporte-tecnico")
	public String getSuporteTecnico() {
		return "Suporte Técnico";
	}
	
	@GetMapping("/designer-ux-ui")
	public String getDesignerUXUI() {
		return "Designer de UX e UI";
	}
	
	@GetMapping("/profissional-bi")
	public String getProfissionalBI() {
		return "Profissional de BI";
	}
	
	@GetMapping("/proissional-redes")
	public String getProfissionalRedes() {
		return "Profissional de Redes";
	}
	
	@GetMapping("/gestor-seguranca-informacao")
	public String getGestorSegurancaInformacao() {
		return "Gestor de Segurança da Informação";
	}
}
