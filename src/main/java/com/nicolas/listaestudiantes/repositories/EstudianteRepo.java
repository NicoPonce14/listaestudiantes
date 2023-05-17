package com.nicolas.listaestudiantes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.listaestudiantes.models.Estudiante;

@Repository
public interface EstudianteRepo extends CrudRepository<Estudiante,Long> {

	List<Estudiante> findAll();
	
	//metodo JPA para buscar personas sin licencia asociada
		List<Estudiante> findByContactInfoIdIsNull();
}
