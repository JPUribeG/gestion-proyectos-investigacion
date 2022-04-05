package com.example.gestion_proyectos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion_proyectos.entidades.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    //public Optional findByUsername(String alias);
	
	//public Optional findByIdAndPassword(Long id, String password);
	
}
