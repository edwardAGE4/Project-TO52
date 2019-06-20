/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author AGE_ROG
 */
@Entity
public class Publication1 implements Serializable {

     private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_publication")
    private Integer idPublication;

    @ManyToOne
    @JoinColumn(name = "id_publication_type",insertable=false, updatable = false, nullable = false)
    private PublicationType publicationType;

    @Column(nullable=false)
    private String englishTitle;

    @Column(nullable=true)
    private String frenchTitle;

    @Column(nullable=false)
    private Long year;

    @Column(nullable=false)
    private Long month;

    @Column(nullable=true)
    private String note;

    @Column(nullable=true)
    private String linkImage;

    @Column(nullable=true)
    private String pdfLink;

    @Column(nullable=true)
    private String issn;

    @Column(nullable=true)
    private String Abstract;

    @Column(nullable=true)
    private String keyWords;
    
    @Column(nullable=true)
    private String typePublication;
    /*
     decoment if you wnat to have this functionality
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_project", nullable = true)
    private Project project;  */

  
    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "publication" , cascade=CascadeType.ALL)
    //@JsonBackReference
    private Set<Author> authors = new HashSet<Author>(0);*/


    public Publication1() {
    }

    public Publication1(Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String Abstract, String keyWords, String typePublication) {
        this.idPublication = idPublication;
        this.publicationType = publicationType;
        this.englishTitle = englishTitle;
        this.frenchTitle = frenchTitle;
        this.year = year;
        this.month = month;
        this.note = note;
        this.linkImage = linkImage;
        this.pdfLink = pdfLink;
        this.issn = issn;
        this.Abstract = Abstract;
        this.keyWords = keyWords;
        this.typePublication = typePublication;
    }

    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    public PublicationType getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

    public String getEnglishTitle() {
        return englishTitle;
    }

    public void setEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
    }

    public String getFrenchTitle() {
        return frenchTitle;
    }

    public void setFrenchTitle(String frenchTitle) {
        this.frenchTitle = frenchTitle;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getPdfLink() {
        return pdfLink;
    }

    public void setPdfLink(String pdfLink) {
        this.pdfLink = pdfLink;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
    
    
    /*
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    } */

    /*public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }*/

    public String getTypePublication() {
        return typePublication;
    }

    public void setTypePublication(String typePublication) {
        this.typePublication = typePublication;
    }
  
}
