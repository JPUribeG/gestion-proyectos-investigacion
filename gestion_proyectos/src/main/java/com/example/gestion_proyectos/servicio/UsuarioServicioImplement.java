package com.example.gestion_proyectos.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestion_proyectos.entidades.Usuario;
import com.example.gestion_proyectos.repository.UsuarioRepository;

@Service
public class UsuarioServicioImplement implements UsuarioServicio {
    
	@Autowired 
	UsuarioRepository repository; 
	
	@Override
	public Iterable<Usuario> getAllUsers() {
		return repository.findAll(); //Para traer todos los usuarios
	}
}
