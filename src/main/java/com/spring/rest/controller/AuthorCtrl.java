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

import com.spring.rest.component.Author;
import com.spring.rest.service.AuthorServ;

/**
 *
 * @author AGE_ROG
 */
@RestController
public class AuthorCtrl {
    @Autowired
	private AuthorServ aservice;

	// Get all countries
	@RequestMapping(value="/getAllAuthors", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Author> getAllAuthors() {
		List<Author> list = aservice.getAllAuthors();		
		return list;
	}

	// Get a country by id
	@RequestMapping(value="/getAuthor/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public Author getCountryById(@PathVariable(name="id") int id) {
		return aservice.getAuthor(id);
	}	
}
