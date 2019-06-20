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
public class Author implements Serializable {

   /* @EmbeddedId
    private AuthorId id;
        
    @Column( nullable = false)
    private String orderAuthor;

    public Author() {
       
    }

    public Author(AuthorId id, String orderAuthor) {
        this.id = id;
        this.orderAuthor = orderAuthor;
    }
    

    public Author(Publication2 p, Members mem, String orderAuthor) {
        this.orderAuthor = orderAuthor;
        this.id = new AuthorId(p.getIdPublication(), mem.getIdMember());
        
        //p.getAuthors().add(this);
       // mem.getAuthors().add(this);
    }
    
    public AuthorId getId() {
        return id;
    }

    public void setId(AuthorId id) {
        this.id = id;
    }

    public String getOrderAuthor() {
        return orderAuthor;
    }

    public void setOrderAuthor(String orderAuthor) {
        this.orderAuthor = orderAuthor;
    }

*/
    
      @EmbeddedId
    private AuthorId id;
    
    //@JsonManagedReference
    //@JsonBackReference
    @ManyToOne
    @JoinColumn(name="fk_publication", insertable=false, updatable = false, referencedColumnName = "id_publication")
    private Publications publication;
    
    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name="fk_member", insertable=false, updatable = false, referencedColumnName = "id_member")
    private Members member;
    
    @Column( nullable = false)
    private String orderAuthor;

    public Author() {
       
    }

    /**
     *
     * @param p
     * @param mem
     * @param orderAuthor
     */
    public Author(Publications p, Members mem, String orderAuthor) {
        this.publication = p;
        this.member = mem;
        this.orderAuthor = orderAuthor;
        this.id = new AuthorId(p.getIdPublication(), mem.getIdMember());
        
        //p.getAuthors().add(this);
        //mem.getAuthors().add(this);
    }
    
    
    
    public Author(AuthorId id, Publications publication, Members member, String orderAuthor) {
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

    public Publications getPublication() {
        return publication;
    }

    public void setPublication(Publications publication) {
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
