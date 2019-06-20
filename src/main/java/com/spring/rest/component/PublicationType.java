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

/**
 *
 * @author AGE_ROG
 */
@Entity
public class PublicationType implements Serializable {

    @Id
    @Column(name="id_publication_type",nullable=false)
    private Integer code;

    @Column(nullable=false)
    private String publicationType;

    /*@Column(nullable = true)
    private String kind; */

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "publicationType")
    private Set<Publication> publications = new HashSet<Publication>(0); */
    /*
    public PublicationType(String code, String publicationType, String kind, Set<Publication> publications) {
        this.code = code;
        this.publicationType = publicationType;
        //this.kind = kind;
        this.publications= publications;
    } */

    public PublicationType(Integer code, String publicationType) {
        this.code = code;
        this.publicationType = publicationType;
    }
    
    
    
    public PublicationType(){}
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }
/*
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    } 
    
    
    public Set<Publication> getPublications() {
        return publications;
    }

    public void setPublications(Set<Publication> publications) {
        this.publications = publications;
    }  */

    @Override
    public String toString() {
        return "PublicationType{" + "code=" + code + ", publicationType=" + publicationType + '}';
    }
    
    
}
