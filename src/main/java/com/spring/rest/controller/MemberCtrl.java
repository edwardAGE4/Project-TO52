/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.component.Members;
import com.spring.rest.component.State;
import com.spring.rest.service.MemberServ;

@RestController
/**
 *
 * @author AGE_ROG
 */
public class MemberCtrl {
    @Autowired
	private MemberServ mservice;
    
    //newly added
    
    //newly added end

	// Get all Members
	@RequestMapping(value="/getAllMembers", method=RequestMethod.GET, headers="Accept=application/json")
	public List<Members> getMembers() {
		List<Members> list = mservice.getAllMembers();		
		return list;
	}

	// Get a Member by id
	@RequestMapping(value="/getMember/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public Members getMemberById(@PathVariable(name="id") int id) {
		return mservice.getMember(id);
	}
        
        // Get a Member by id
	@RequestMapping(value="/getMemberState/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public State getMemberStateById(@PathVariable(name="id") int id) {
		return mservice.getMemberState(id);
	}
}
