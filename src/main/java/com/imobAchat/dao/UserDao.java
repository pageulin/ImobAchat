package com.imobAchat.dao;

import java.util.Iterator;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Service;

import com.imobAchat.model.User;
import com.imobAchat.repositories.UserRepository;

/**
 * Session Bean implementation class UserDao
 */

@Stateful

//@Service
@Transactional
public class UserDao implements UserDaoLocal {

	@PersistenceContext
	EntityManager entityManager;

	private static final String JPQL_SELECT_PAR_EMAIL = "SELECT id FROM User u WHERE u.email=:email"; 
	private static final String PARAM_USER = "email"; 

	
	//@Autowired
	//private UserRepository ur;
	
    /**
     * Default constructor. 
     */
    public UserDao() {
        // TODO Auto-generated constructor stub
    	System.out.println("userDao()");
        /*
         * JpaRepositoryFactory jpaRepositoryFactory=new JpaRepositoryFactory(entityManager);
         
        ur = jpaRepositoryFactory.getRepository(UserRepository.class);*/
        
    }
    
    public void addUser(User u){
    	//ur.save(u);
    	//System.out.println(u.toString());
    	Query requete = entityManager.createQuery("SELECT id FROM User");
    	
		entityManager.persist(u);
	
    	List<Integer> users = (List<Integer>)requete.getResultList();
    	Iterator<Integer> ite = users.iterator(); 
    	while(ite.hasNext()){
    		System.out.println(entityManager.find(User.class, ite.next()));
    	}	
    }


	public void editUser(User u) {
		//ur.save(u);
		
	}


	public void deleteUser(int userId) {
		//ur.delete(userId);
		
	}
	
	public User findUserById(int id){
		
		return entityManager.find(User.class, id);
		
	}

	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		//entityManager.createNativeQuery("SELECT id FROM user WHERE email=" + email);
		Query requete = entityManager.createQuery(JPQL_SELECT_PAR_EMAIL); 
		requete.setParameter(PARAM_USER, email); 
		List<Integer> id_users = (List<Integer>)requete.getResultList();
		if(id_users != null)
			return entityManager.find(User.class, id_users.get(0));
		else
			return null;
		
	}
	
	public List<User> findAll(){
		return null;// ur.findAll();
	}

}
