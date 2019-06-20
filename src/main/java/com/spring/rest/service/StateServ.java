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

import com.spring.rest.component.State;
import com.spring.rest.repository.StateDao;

@Service
/**
 *
 * @author AGE_ROG
 */
public class StateServ {
    	@Autowired
	private StateDao cdao;

	public List<State> getAllState() {
		return cdao.getAllState();
	}

	@Transactional
	public State getState(int id) {
		return cdao.getState(id);
	}
}
