/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.component.Address;
import com.spring.rest.repository.AddressDao;

@Service
/**
 *
 * @author AGE_ROG
 */
public class AddressServ {
    	@Autowired
	private AddressDao cdao;

	public List<Address> getAllAddresses() {
		return cdao.getAllAddresses();
	}

	@Transactional
	public Address getAddress(int id) {
		return cdao.getAddress(id);
	}	
}
