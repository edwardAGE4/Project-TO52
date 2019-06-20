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

import com.spring.rest.component.Author;

@Repository
/**
 *
 * @author AGE_ROG
 */
public class AuthorDao {
    @Autowired
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Get all author from the database	
	public List<Author> getAllAuthors() {			
		List<Author> authors = getTemplate().loadAll(Author.class);

		for(Author c : authors)
			System.out.println(c.toString());

		return authors;
	}

	// Get country by id from the database
	public Author getAuthor(int id) {		
		Author author = (Author) getTemplate().get(Author.class, new Integer(id));
		System.out.println(author.toString());
		return author;
	}
}
