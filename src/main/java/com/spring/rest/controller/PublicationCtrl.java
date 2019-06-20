/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.controller;

import com.spring.rest.component.Publications;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.component.Publications;
import com.spring.rest.component.Publication2;

import com.spring.rest.component.State;
import com.spring.rest.service.PublicationServ;

@RestController
/**
 *
 * @author AGE_ROG
 */
public class PublicationCtrl {
     @Autowired
	private PublicationServ mservice;
    
    //newly added
    
    //newly added end

	// Get all Members
	@RequestMapping(value="/getAllPublication", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Publications> getAllPublication() {
		List<Publications> list = mservice.getAllPublication();		
		return list;
	}
        
        	// Get all Members
	@RequestMapping(value="/getAllPub", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Publications> getAllPub() {
		List<Publications> list = mservice.getAllPub();		
		return list;
	}

	// Get a Member by id
	@RequestMapping(value="/getPublication/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public Publication2 getPublication(@PathVariable(name="id") int id) {
		return mservice.getPublication(id);
	}
        
        
}
