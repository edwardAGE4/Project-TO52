/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.component.PublicationType;
import com.spring.rest.service.PublicationTypeServ;

@RestController
/**
 *
 * @author AGE_ROG
 */
public class PublicationTypeCtrl {
      	@Autowired
	private PublicationTypeServ aservice;

	// Get all countries
	@RequestMapping(value="/getAllPublicationType", method=RequestMethod.GET, headers="Accept=application/json")
	public List<PublicationType> getAllPublicationType() {
		List<PublicationType> list = aservice.getAllPublicationType();		
		return list;
	}

	// Get a country by id
	@RequestMapping(value="/getPublicationType/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public PublicationType getPublicationTypeById(@PathVariable(name="id") int id) {
		return aservice.getPublicationType(id);
	}	  
}
