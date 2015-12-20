package com.imobAchat.dao;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imobAchat.model.User;

@Service
@Transactional
public class InitService {

	@Autowired
	private UserDao uD;
	
	@PostConstruct
	public void init(){
		User u = new User();
		u.setEmail("toto@gmail.com");
		u.setFirstname("toto");
		u.setLastName("titi");
		u.setPseudo("toto");
		
		uD.addUser(u);
		
	}
	
}
