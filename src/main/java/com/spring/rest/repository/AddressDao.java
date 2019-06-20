/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.rest.component.Address;
@Repository
/**
 *
 * @author AGE_ROG
 */
public class AddressDao {
    @Autowired
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Get all countries from the database	
	public List<Address> getAllAddresses() {			
		List<Address> addresses = getTemplate().loadAll(Address.class);

		for(Address a : addresses)
			System.out.println(a.toString());

		return addresses;
	}

	// Get country by id from the database
	public Address getAddress(int id) {		
		Address address = (Address) getTemplate().get(Address.class, new Integer(id));
		System.out.println(address.toString());
		return address;
	}
}
