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
public class Proceeding extends Publication1 implements Serializable {

    @Column(nullable = true)
    private String Editor;

    @Column(nullable = true)
    private Long Volume;

    @Column(nullable = true)
    private String Series;

    @Column(nullable = true)
    private String Organization;

    @Column(nullable = true)
    private String Publisher;

    /*public Proceeding(String Editor, Long Volume, String Series, String Organization, String Publisher, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords, Set<Author> authors) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, authors);
        this.Editor = Editor;
        this.Volume = Volume;
        this.Series = Series;
        this.Organization = Organization;
        this.Publisher = Publisher;
    }*/

     public Proceeding(String Editor, Long Volume, String Series, String Organization, String Publisher, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords,  String typepublication) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, typepublication);
        this.Editor = Editor;
        this.Volume = Volume;
        this.Series = Series;
        this.Organization = Organization;
        this.Publisher = Publisher;
    }
    
    

    public Proceeding(String editor, Long volume, String series, String organization, String publisher) {
        Editor = editor;
        Volume = volume;
        Series = series;
        Organization = organization;
        Publisher = publisher;
    }

    public Proceeding() {

    }

    public String getEditor() {
        return Editor;
    }

    public void setEditor(String editor) {
        Editor = editor;
    }

    public Long getVolume() {
        return Volume;
    }

    public void setVolume(Long volume) {
        Volume = volume;
    }

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        Series = series;
    }

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String organization) {
        Organization = organization;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proceeding)) return false;
        if (!super.equals(o)) return false;
        Proceeding that = (Proceeding) o;
        return Objects.equals(getEditor(), that.getEditor()) &&
                Objects.equals(getVolume(), that.getVolume()) &&
                Objects.equals(getSeries(), that.getSeries()) &&
                Objects.equals(getOrganization(), that.getOrganization()) &&
                Objects.equals(getPublisher(), that.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEditor(), getVolume(), getSeries(), getOrganization(), getPublisher());
    }
}
