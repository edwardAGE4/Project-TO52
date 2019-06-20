/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.repository;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.persistence.EntityManager;
import com.spring.rest.component.Publication2;
import com.spring.rest.component.Publications;

import com.spring.rest.component.State;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
@Repository

/**
 *
 * @author AGE_ROG
 */
public class PublicationDao {
        @Autowired
	private HibernateTemplate template;

    @PersistenceContext
    protected EntityManager entityManager;
    
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Get all countries from the database	
        
    @Transactional
	public List<Publications> getAllPublication() {	
             Query query = entityManager.createQuery("SELECT cs FROM Publications cs", Publications.class);
                List<Publications> list = query.getResultList();
               System.out.println(list);
            
            
		/*List<Members> members = getTemplate().loadAll(Members.class);

		for(Members m : members)
			System.out.println(m.toString());*/

		return list;
	}
        
            @Transactional
	public List<Publications> getAllPub() {	
             Query query = entityManager.createQuery("SELECT cs FROM Publications cs", Publications.class);
                List<Publications> list = query.getResultList();
               System.out.println(list);
            
            
		/*List<Members> members = getTemplate().loadAll(Members.class);

		for(Members m : members)
			System.out.println(m.toString());*/

		return list;
	}

	// Get country by id from the database
	/*public Members getMember(int id) {		
		Members member = (Members) getTemplate().get(Members.class, new Integer(id));
		System.out.println(member.toString());
                Hibernate.initialize(member.getState());
		return member;
                
	}*/
        
        
    @Transactional
        public Publication2 getPublication(int id) {		
            Publication2 publication = entityManager.find(Publication2.class, new Integer(id));
            System.out.println(publication.toString());
          
                    
                    System.out.println(publication);
            return publication;
                
	}

}
