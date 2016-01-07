package com.imobAchat.dao;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imobAchat.model.User;

@Service
@Transactional
public class InitService {

	//@Autowired
	@EJB(name="UserDao")
	private UserDaoLocal uD;
	
	public InitService() {
		// TODO Auto-generated constructor stub
		uD = new UserDao();
	}
	
	public void addUser(User u){
		uD.addUser(u);
	}
	
	@PostConstruct
	public void init(){

		User u = new User();
		u.setEmail("toto@gmail.com");
		u.setFirstname("tata");
		u.setLastName("titi");
		u.setPseudo("toto");
		
		uD.addUser(u);
		//System.out.println(uD.findUserByEmail("a").getEmail());
	}
	
}
