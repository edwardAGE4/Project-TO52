/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
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
public class Manuel extends Publication1 implements Serializable {
     
    @Column(nullable = true)
    private String Organization;

    @Column(nullable = true)
    private String Edition;

    @Column(nullable = true)
    private String Institution;

    @Column(nullable = true)
    private Long Number;

   /* public Manuel(String Organization, String Edition, String Institution, Long Number, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords, Set<Author> authors) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, authors);
        this.Organization = Organization;
        this.Edition = Edition;
        this.Institution = Institution;
        this.Number = Number;
    }*/

        public Manuel(String Organization, String Edition, String Institution, Long Number, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords, String typepublication) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, typepublication);
        this.Organization = Organization;
        this.Edition = Edition;
        this.Institution = Institution;
        this.Number = Number;
    }
    
    public Manuel(String organization, String edition, String institution, Long number) {
        Organization = organization;
        Edition = edition;
        Institution = institution;
        Number = number;
    }

    public Manuel() {

    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public String getInstitution() {
        return Institution;
    }

    public void setInstitution(String institution) {
        Institution = institution;
    }

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long number) {
        Number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manuel)) return false;
        if (!super.equals(o)) return false;
        Manuel manuel = (Manuel) o;
        return Objects.equals(getOrganization(), manuel.getOrganization()) &&
                Objects.equals(getEdition(), manuel.getEdition()) &&
                Objects.equals(getInstitution(), manuel.getInstitution()) &&
                Objects.equals(getNumber(), manuel.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOrganization(), getEdition(), getInstitution(), getNumber());
    }
}
