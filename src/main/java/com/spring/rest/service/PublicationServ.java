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

import com.spring.rest.component.Publication2;
import com.spring.rest.component.Publications;

import com.spring.rest.component.State;
import com.spring.rest.repository.PublicationDao;
@Service
/**
 *
 * @author AGE_ROG
 */
public class PublicationServ {
    	@Autowired
	private PublicationDao mdao;

	public List<Publications> getAllPublication() {
		return mdao.getAllPublication();
	}
        
        public List<Publications> getAllPub() {
		return mdao.getAllPub();
	}

	public Publication2 getPublication(int id) {
		return mdao.getPublication(id);
	}
}
