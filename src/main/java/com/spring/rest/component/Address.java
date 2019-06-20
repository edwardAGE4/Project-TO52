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
import javax.persistence.Table;
import org.hibernate.annotations.Proxy;

/**
 *
 * @author AGE_ROG
 */
@Proxy(lazy = false)
@Entity
@Table(name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAddress",nullable=false)
    private Long idAddress;
    
    @Column(name = "addressCity",nullable=true)
    private String city;

    @Column(name = "addressZipcode",nullable=true)
    private String zipcode;

    public Address() {
    }

    public Address(Long idAddress, String city, String zipcode) {
        this.idAddress = idAddress;
        this.city = city;
        this.zipcode = zipcode;
    }
    
    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" + "idAddress=" + idAddress + ", city=" + city + ", zipcode=" + zipcode + '}';
    }
     
}
