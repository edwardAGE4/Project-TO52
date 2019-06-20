/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author AGE_ROG
 */
@Entity
public class Members implements Serializable {

     private static final Long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_member",nullable=false, updatable=false)
    private Integer idMember;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private String firstName;

    @Column
    private String linkImage;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;

    @Column(nullable=true)
    private String login;

    @Column(nullable=true)
    private String email;

    @Column
    private String session;

    @ManyToOne
    @JoinColumn(name = "id_status", insertable=false, updatable = false, referencedColumnName = "id_status")
    private State state;
    
    @OneToOne
    @JoinColumn(name="id_address",insertable=false, updatable = false, referencedColumnName="idAddress")
    private Address Addresss;
   
   /* @Column(name = "fk_status")
    private String fk_State;
    
    @Column(name = "fk_address")
    private String fk_Address;*/

  /*  public Members(Integer idMember, String lastName, String firstName, String linkImage, Date startDate, String login, String email, String session, State state, String fk_State, String fk_Address) {
        this.idMember = idMember;
        this.lastName = lastName;
        this.firstName = firstName;
        this.linkImage = linkImage;
        this.startDate = startDate;
        this.login = login;
        this.email = email;
        this.session = session;
        this.state = state;
      /*  this.fk_State = fk_State;
        this.fk_Address = fk_Address;
    }*/

    public Members(Integer idMember, String lastName, String firstName, String linkImage, Date startDate, String login, String email, String session, State state, Address Addresss) {
        this.idMember = idMember;
        this.lastName = lastName;
        this.firstName = firstName;
        this.linkImage = linkImage;
        this.startDate = startDate;
        this.login = login;
        this.email = email;
        this.session = session;
        this.state = state;
        this.Addresss = Addresss;
    }
    
    

    public Members() {
    }

    public Integer getIdMember() {
        return idMember;
    }

    public void setIdMember(Integer idMember) {
        this.idMember = idMember;
    }

    public Address getAddresss() {
        return Addresss;
    }

    public void setAddresss(Address Addresss) {
        this.Addresss = Addresss;
    }
    
    

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
/*
    public String getFk_State() {
        return fk_State;
    }

    public void setFk_State(String fk_State) {
        this.fk_State = fk_State;
    }

    public String getFk_Address() {
        return fk_Address;
    }

    public void setFk_Address(String fk_Address) {
        this.fk_Address = fk_Address;
    }*/

    
}
