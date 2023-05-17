package com.nicolas.listaestudiantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.listaestudiantes.models.Estudiante;
import com.nicolas.listaestudiantes.repositories.EstudianteRepo;

@Service
public class EstudianteService {

	@Autowired
	private EstudianteRepo serv;
	
	public List<Estudiante> showAll(){
		return serv.findAll();
	}
	
	//crea un estudiante
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return serv.save(estudiante);
	}
	
	public List<Estudiante> estudianteSinInfo(){
		return serv.findByContactInfoIdIsNull();
	}
}
