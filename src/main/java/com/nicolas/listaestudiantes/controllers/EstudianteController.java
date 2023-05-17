package com.nicolas.listaestudiantes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nicolas.listaestudiantes.models.Estudiante;
import com.nicolas.listaestudiantes.services.EstudianteService;

import jakarta.validation.Valid;

@Controller
public class EstudianteController {

	@Autowired
	private EstudianteService serv;

	@GetMapping("/")
	public String index(Model m) {
		m.addAttribute("todo", serv.showAll());
		return "index.jsp";
	}

	@GetMapping("/students/new")
	public String formPersona(@ModelAttribute("estudiante") Estudiante estudiante) {
		return "newStudent.jsp";
	}

	@PostMapping("/students/new")
	public String nuevoEstudiante(@Valid @ModelAttribute("estudiante") Estudiante estudiante, BindingResult binding) {
		if (binding.hasErrors()) {
			return "newStudent.jsp";
		} else {
			serv.crearEstudiante(estudiante);
			return "redirect:/";
		}
	}
}
