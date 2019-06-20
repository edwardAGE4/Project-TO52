/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

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
public class Members3 implements Serializable {

     private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_member",nullable=false, updatable=false)
    private Integer idMember;

    @OneToOne
    @JoinColumn(name="idAddress", referencedColumnName="idAddress")
    private Address Addresss;

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
    
    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "manager")
    private Set<Project> managerprojects = new HashSet<Project>(0); */

    /*@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "author",
            joinColumns = { @JoinColumn(name = "idMember") },
            inverseJoinColumns = { @JoinColumn(name = "idPublication") }
    ) */
    
    
    //@JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member" , cascade=CascadeType.ALL)
    private Set<Author> authors = new HashSet<Author>(0);  
    /*
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.member", cascade=CascadeType.ALL)
    @JsonBackReference
    private Set<Author> authors = new HashSet<Author>(0); */


    public Members3(Integer idMember, Address addresss, String lastName, String firstName, String linkImage, Date startDate, String login, String email, String session, State state /*, Set<Project> projects, Set<Project> managerprojects, Set<Author> authors */ ) {

        Addresss = addresss;
        this.lastName = lastName;
        this.firstName = firstName;
        this.linkImage = linkImage;
        this.startDate = startDate;
        this.login = login;
        this.email = email;
        this.session = session;
        this.state = state;
        /*this.projects= projects;
        this.managerprojects=managerprojects;
        this.authors= authors; */
    }
    
    

    public Members3() {

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

    public void setAddresss(Address addresss) {
        Addresss = addresss;
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

  
    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    /*
    public Set<Project> getManagerprojects() {
        return managerprojects;
    }

    public void setManagerprojects(Set<Project> managerprojects) {
        this.managerprojects = managerprojects;
    } */
    /*
    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    } */

   /* @Override
    public String toString() {
        return "Members{" + "idMember=" + idMember + ", Addresss=" + Addresss + ", lastName=" + lastName + ", firstName=" + firstName + ", linkImage=" + linkImage + ", startDate=" + startDate + ", login=" + login + ", email=" + email + ", session=" + session + ", status=" + status + '}';
    }*/


    /**
     * @return the projects
     
    public Set<Project> getProjects() {
        return this.projects;
    }

    /**
     * @param projects the participants to set
     
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    } */

   
    
}
