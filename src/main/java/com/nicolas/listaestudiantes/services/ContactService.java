package com.nicolas.listaestudiantes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.listaestudiantes.models.ContactInfo;
import com.nicolas.listaestudiantes.repositories.ContactRepo;

@Service
public class ContactService {

	@Autowired
	private ContactRepo serv;
	
	public ContactInfo crearContactInfo(ContactInfo c) {
		return serv.save(c);
	}
	
	
}
