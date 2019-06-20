/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.component.Members;
import com.spring.rest.component.State;
import com.spring.rest.repository.MemberDao;
/**
 *
 * @author AGE_ROG
 */

@Service
public class MemberServ {
    
	@Autowired
	private MemberDao mdao;

	public List<Members> getAllMembers() {
		return mdao.getAllMembers();
	}

	public Members getMember(int id) {
		return mdao.getMember(id);
	}
        
        public State getMemberState(int id) {
		return mdao.getMemberState(id);
	}
}
