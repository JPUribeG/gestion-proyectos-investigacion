package com.example.gestion_proyectos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUsuario {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/formularioUsuario")
	public String formularioUsuario( ) {
		return "formulario-usuario/user-view";
	}
}
