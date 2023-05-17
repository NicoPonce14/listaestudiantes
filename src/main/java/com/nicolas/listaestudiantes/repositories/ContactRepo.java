package com.nicolas.listaestudiantes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nicolas.listaestudiantes.models.ContactInfo;

public interface ContactRepo extends CrudRepository<ContactInfo,Long> {

	
}
