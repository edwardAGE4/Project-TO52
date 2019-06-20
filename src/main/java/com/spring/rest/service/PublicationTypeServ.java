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

import com.spring.rest.component.PublicationType;
import com.spring.rest.repository.PublicationTypeDao;

@Service
/**
 *
 * @author AGE_ROG
 */
public class PublicationTypeServ {
    	@Autowired
	private PublicationTypeDao cdao;

	public List<PublicationType> getAllPublicationType() {
		return cdao.getAllPublicationType();
	}

	@Transactional
	public PublicationType getPublicationType(int id) {
		return cdao.getPublicationType(id);
	}	
}
