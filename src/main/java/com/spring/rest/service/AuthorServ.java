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

import com.spring.rest.component.Author;
import com.spring.rest.repository.AuthorDao;

@Service
/**
 *
 * @author AGE_ROG
 */
public class AuthorServ {
    @Autowired
	private AuthorDao adao;

	public List<Author> getAllAuthors() {
		return adao.getAllAuthors();
	}

	@Transactional
	public Author getAuthor(int id) {
		return adao.getAuthor(id);
	}	
}
