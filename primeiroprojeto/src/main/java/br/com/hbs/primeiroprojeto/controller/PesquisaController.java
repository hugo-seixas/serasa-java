package br.com.hbs.primeiroprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hbs.primeiroprojeto.model.entidades.Pesquisa;

@Controller
@RequestMapping("/pesquisas")
public class PesquisaController {
	
	@GetMapping("/nova-pesquisa")
	public String carregaFormulario(Model model) {
		model.addAttribute("pesquisa", new Pesquisa());
		return "form-pesquisa";
	}
	
	

}
