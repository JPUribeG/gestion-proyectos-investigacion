package com.example.gestion_proyectos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion_proyectos.entidades.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {

}
