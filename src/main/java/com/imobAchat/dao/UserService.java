package com.imobAchat.dao;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.User;

@Service
@Transactional
public class UserService {

	//@Autowired
	@EJB(name="UserDao")
	private UserDaoLocal uD;
	
	public UserService() {
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

	public void editUser(User u) {
		uD.editUser(u);
		
	}

	public void deleteUser(int userId) {
		uD.deleteUser(userId);
	}

	public User findUserByEmail(String email) {
		return uD.findUserByEmail(email);
	}

	public User findUserById(int id) {
		return uD.findUserById(id);
	}
	
}
