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

import com.spring.rest.component.Address;
import com.spring.rest.service.AddressServ;

@RestController
/**
 *
 * @author AGE_ROG
 */
public class AddressCtrl {
    	@Autowired
	private AddressServ aservice;

	// Get all countries
	@RequestMapping(value="/getAllAddresses", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Address> getAddresses() {
		List<Address> list = aservice.getAllAddresses();		
		return list;
	}

	// Get a country by id
	@RequestMapping(value="/getAddress/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public Address getCountryById(@PathVariable(name="id") int id) {
		return aservice.getAddress(id);
	}	
}
