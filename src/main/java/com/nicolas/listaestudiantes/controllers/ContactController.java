package com.nicolas.listaestudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nicolas.listaestudiantes.models.ContactInfo;
import com.nicolas.listaestudiantes.models.Estudiante;
import com.nicolas.listaestudiantes.services.ContactService;
import com.nicolas.listaestudiantes.services.EstudianteService;

import jakarta.validation.Valid;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService serv;
	
	@Autowired
	private EstudianteService servE;
	
	 @GetMapping("/contact/new")
		public String formContacto(@ModelAttribute("contact") ContactInfo contact,Model m) {
		 List<Estudiante> per = servE.estudianteSinInfo();
			m.addAttribute("per",per);
		 return "newContact.jsp";
		}
		
		@PostMapping("/contact/new")
		public String nuevoContacto(@Valid @ModelAttribute("contact") ContactInfo contact, BindingResult binding) {
			if (binding.hasErrors()) {
				return "newContact.jsp";
			} else {
				serv.crearContactInfo(contact);
				return "redirect:/";
			}
		}
}
