/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author AGE_ROG
 */
@Entity
public class Author3 implements Serializable {

     @EmbeddedId
    private AuthorId id;
    
    //@JsonManagedReference
    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name="fk_publication", insertable=false, updatable = false, referencedColumnName = "id_publication")
    private Publication2 publication;
    
    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name="fk_member", insertable=false, updatable = false, referencedColumnName = "id_member")
    private Members member;
    
    @Column( nullable = false)
    private String orderAuthor;

    public Author3() {
       
    }

    /**
     *
     * @param p
     * @param mem
     * @param orderAuthor
     */
    public Author3(Publication2 p, Members mem, String orderAuthor) {
        this.publication = p;
        this.member = mem;
        this.orderAuthor = orderAuthor;
        this.id = new AuthorId(p.getIdPublication(), mem.getIdMember());
        
        //p.getAuthors().add(this);
        //mem.getAuthors().add(this);
    }
    
    
    
    public Author3(AuthorId id, Publication2 publication, Members member, String orderAuthor) {
        this.id = id;
        this.publication = publication;
        this.member = member;
        this.orderAuthor = orderAuthor;
    }

    public AuthorId getId() {
        return id;
    }

    public void setId(AuthorId id) {
        this.id = id;
    }

    public Publication2 getPublication() {
        return publication;
    }

    public void setPublication(Publication2 publication) {
        this.publication = publication;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
    }

    public String getOrderAuthor() {
        return orderAuthor;
    }

    public void setOrderAuthor(String orderAuthor) {
        this.orderAuthor = orderAuthor;
    }


    
}
