/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.component;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author AGE_ROG
 */
@Embeddable
public class AuthorId implements Serializable {

    @Column(name = "fk_publication")
      protected Integer fkidPublication;

      @Column(name = "fk_member")
      protected Integer fkidMember;

      public AuthorId() {

      }

    public AuthorId(Integer idPublication, Integer idMember) {
        this.fkidPublication = idPublication;
        this.fkidMember = idMember;
    }
		
		
                
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((fkidPublication == null) ? 0 : fkidPublication.hashCode());
			result = prime * result
					+ ((fkidMember == null) ? 0 : fkidMember.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			
			AuthorId other = (AuthorId) obj;
			
			if (fkidPublication == null) {
				if (other.fkidPublication != null)
					return false;
			} else if (!fkidPublication.equals(other.fkidPublication))
				return false;
			
			if (fkidMember == null) {
				if (other.fkidMember != null)
					return false;
			} else if (!fkidMember.equals(other.fkidMember))
				return false;
			
			return true;
		}

    public Integer getIdPublication() {
        return fkidPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.fkidPublication = idPublication;
    }

    public Integer getIdMember() {
        return fkidMember;
    }

    public void setIdMember(Integer idMember) {
        this.fkidMember = idMember;
    }

    
}
