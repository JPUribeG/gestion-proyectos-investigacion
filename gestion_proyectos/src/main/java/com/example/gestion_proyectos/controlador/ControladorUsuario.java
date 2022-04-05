package com.example.gestion_proyectos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gestion_proyectos.entidades.Usuario;
import com.example.gestion_proyectos.repository.RolRepository;
import com.example.gestion_proyectos.servicio.UsuarioServicio;

@Controller
public class ControladorUsuario {

	@Autowired
	UsuarioServicio usuarioServicio;
	
	@Autowired
	RolRepository rolRepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/formularioUsuario")
	public String formularioUsuario(Model modelo) {
		modelo.addAttribute("userForm", new Usuario());
		modelo.addAttribute("userList", usuarioServicio.getAllUsers());
		modelo.addAttribute("roles",rolRepository.findAll());
		modelo.addAttribute("listTab","active");
		return "formulario-usuario/user-view";
	}
}
