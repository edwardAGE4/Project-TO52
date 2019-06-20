/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_project",nullable=false, updatable=false)
    private long idProject;

    @ManyToOne
    @JoinColumn(name = "id_member", nullable = false)
    private Members manager;

    @Column(nullable=false)
    private String name;

    @Column
    private Date creationdate;
    /*
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "project")//, mappedBy = "project"
    private Set<Publication> publications = new HashSet<Publication>(0);

    @ManyToMany(mappedBy = "projects")
    private Set<Member> members = new HashSet<>(); */

    public Project(long idProject, Members manager, String name, Date creationdate) {
        this.manager = manager;
        this.name = name;
        this.creationdate = creationdate;
    }
    public Project() {

    }
    /*
    public Project(long idProject, Members manager, String name, Date creationdate, Set<Member> members, Set<Publication> publications) {
        this.manager = manager;
        this.name = name;
        this.creationdate = creationdate;
        this.members= members;
        this.publications= publications; 
    }  */

    public long getIdProject() {

        return idProject;
    }

    public void setIdProject(long idProject) {
        this.idProject = idProject;
    }

    public Members getManager() {
        return manager;
    }

    public void setManager(Members manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }
    /*
    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    public Set<Publication> getPublications() {
        return publications;
    }
    
    public void setPublications(Set<Publication> publications) {
        this.publications = publications;
    }
*/
    
}
