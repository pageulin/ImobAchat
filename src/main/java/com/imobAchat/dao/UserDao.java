package com.imobAchat.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imobAchat.model.User;
import com.imobAchat.repositories.UserRepository;

/**
 * Session Bean implementation class UserDao
 */
/*@Stateless
@LocalBean*/

@Service
@Transactional
public class UserDao {

	
	@Autowired
	private UserRepository ur;
	
    /**
     * Default constructor. 
     */
    public UserDao() {
        // TODO Auto-generated constructor stub
    }
    
    public void addUser(User u){
    	ur.save(u);
    }


	public void editUser(User u) {
		ur.save(u);
		
	}


	public void deleteUser(int userId) {
		ur.delete(userId);
		
	}

	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
