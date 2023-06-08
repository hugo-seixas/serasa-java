package br.com.hbs.primeiroprojeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class OlaMundoController extends HttpServlet {
	
	@GetMapping("/olamundo")
	public String olaMundo(HttpServletRequest request) {
		request.setAttribute("nome", "joao");
		return "ola";
	}

}
