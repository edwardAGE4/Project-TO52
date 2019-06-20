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
public class MpThesis extends Publication1 implements Serializable {

    
    @Column(nullable = true)
    private String School;
/*
    public MpThesis(String School, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords, Set<Author> authors) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, authors);
        this.School = School;
    }
*/
     public MpThesis(String School, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords, String typepublication) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, typepublication);
        this.School = School;
    }
    
    public MpThesis(String school) {
        School = school;
    }

    public MpThesis() {

    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MpThesis)) return false;
        if (!super.equals(o)) return false;
        MpThesis mpThesis = (MpThesis) o;
        return Objects.equals(getSchool(), mpThesis.getSchool());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSchool());
    }
    
}
