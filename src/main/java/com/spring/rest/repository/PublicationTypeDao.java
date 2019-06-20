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

import com.spring.rest.component.PublicationType;
@Repository
/**
 *
 * @author AGE_ROG
 */
public class PublicationTypeDao {
        @Autowired
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Get all countries from the database	
	public List<PublicationType> getAllPublicationType() {			
		List<PublicationType> PublicationTs = getTemplate().loadAll(PublicationType.class);

		for(PublicationType m : PublicationTs)
			System.out.println(m.toString());

		return PublicationTs;
	}

	// Get country by id from the database
	public PublicationType getPublicationType(int id) {		
		PublicationType publicationTypes = (PublicationType) getTemplate().get(PublicationType.class, new Integer(id));
		System.out.println(publicationTypes.toString());
		return publicationTypes;
	}
}
