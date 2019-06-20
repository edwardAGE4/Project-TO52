/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import com.fasterxml.jackson.annotation.JsonFilter;
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
public class State {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id_status",nullable=false)
    private long id_status;

    @Column(name="label",nullable=false)
    private String statusLabel;

    public State(long id_status, String statusLabel) {
        this.id_status = id_status;
        this.statusLabel = statusLabel;
    }

    
    //Constructeur
    public State()
    {
        
    }

    public long getId_status() {
        return id_status;
    }

    public void setId_status(long id_status) {
        this.id_status = id_status;
    }

    
    public String getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    @Override
    public String toString() {
        return "Status{" + "id_status=" + id_status + ", statusLabel=" + statusLabel + '}';
    }
    
}
