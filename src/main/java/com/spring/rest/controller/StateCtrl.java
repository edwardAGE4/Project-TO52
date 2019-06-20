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

import com.spring.rest.component.State;
import com.spring.rest.service.StateServ;

@RestController
/**
 *
 * @author AGE_ROG
 */
public class StateCtrl {
        @Autowired
	private StateServ aservice;

	// Get all countries
	@RequestMapping(value="/getAllStates", method=RequestMethod.GET, headers="Accept=application/json")
	public List<State> getAllState() {
		List<State> list = aservice.getAllState();		
		return list;
	}

	// Get a country by id
	@RequestMapping(value="/getState/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public State getState(@PathVariable(name="id") int id) {
		return aservice.getState(id);
	}	  
}
