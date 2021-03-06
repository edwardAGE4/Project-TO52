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
public class InBook extends Publication1 implements Serializable {

      @Column(nullable = true)
    private String Chapter;

    @Column(nullable = true)
    private Long Pages;

    @Column(nullable = true)
    private Long Volume;

    @Column(nullable = true)
    private String Series;

    @Column(nullable = true)
    private String Edition;

    @Column(nullable = true)
    private String Publisher;

   /* public InBook(String Chapter, Long Pages, Long Volume, String Series, String Edition, String Publisher, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords,  Set<Author> authors) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, authors);
        this.Chapter = Chapter;
        this.Pages = Pages;
        this.Volume = Volume;
        this.Series = Series;
        this.Edition = Edition;
        this.Publisher = Publisher;
    }*/

        public InBook(String Chapter, Long Pages, Long Volume, String Series, String Edition, String Publisher, Integer idPublication, PublicationType publicationType, String englishTitle, String frenchTitle, Long year, Long month, String note, String linkImage, String pdfLink, String issn, String anAbstract, String keyWords,  String typepublicaiton) {
        super(idPublication, publicationType, englishTitle, frenchTitle, year, month, note, linkImage, pdfLink, issn, anAbstract, keyWords, typepublicaiton);
        this.Chapter = Chapter;
        this.Pages = Pages;
        this.Volume = Volume;
        this.Series = Series;
        this.Edition = Edition;
        this.Publisher = Publisher;
    }
    
    public InBook(String chapter, Long pages, Long volume, String series, String edition, String publisher) {
        Chapter = chapter;
        Pages = pages;
        Volume = volume;
        Series = series;
        Edition = edition;
        Publisher = publisher;
    }

    public InBook() {

    }

    public String getChapter() {
        return Chapter;
    }

    public void setChapter(String chapter) {
        Chapter = chapter;
    }

    public Long getPages() {
        return Pages;
    }

    public void setPages(Long pages) {
        Pages = pages;
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

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
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
        if (!(o instanceof InBook)) return false;
        if (!super.equals(o)) return false;
        InBook inBook = (InBook) o;
        return Objects.equals(getChapter(), inBook.getChapter()) &&
                Objects.equals(getPages(), inBook.getPages()) &&
                Objects.equals(getVolume(), inBook.getVolume()) &&
                Objects.equals(getSeries(), inBook.getSeries()) &&
                Objects.equals(getEdition(), inBook.getEdition()) &&
                Objects.equals(getPublisher(), inBook.getPublisher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getChapter(), getPages(), getVolume(), getSeries(), getEdition(), getPublisher());
    }
    
}
