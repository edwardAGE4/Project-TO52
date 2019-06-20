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

import com.spring.rest.component.State;
@Repository
/**
 *
 * @author AGE_ROG
 */
public class StateDao {
            @Autowired
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Get all countries from the database	
	public List<State> getAllState() {			
		List<State> States = getTemplate().loadAll(State.class);

		for(State m : States)
			System.out.println(m.toString());

		return States;
	}

	// Get country by id from the database
	public State getState(int id) {		
		State states = (State) getTemplate().get(State.class, new Integer(id));
		System.out.println(states.toString());
		return states;
	}
}
