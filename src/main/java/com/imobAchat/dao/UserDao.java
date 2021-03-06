package com.imobAchat.dao;

import java.util.Collection;
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

import com.imobAchat.model.Announcement;
import com.imobAchat.model.Notification;
import com.imobAchat.model.Search;
import com.imobAchat.model.User;
import com.imobAchat.repositories.UserRepository;

/**
 * Session Bean implementation class UserDao
 */

@Stateful
@Transactional
public class UserDao implements UserDaoLocal {

	@PersistenceContext
	EntityManager entityManager;

	private static final String JPQL_SELECT_PAR_EMAIL = "SELECT id FROM User u WHERE u.email=:email"; 
	private static final String PARAM_USER = "email"; 

    public UserDao() {
        
    }
    
    public void addUser(User u){  
    	
		entityManager.persist(u);
    }

	public void editUser(User u) {
		entityManager.merge(u);
	}

	public void deleteUser(int userId) {
		//ur.delete(userId);
		
	}

	@SuppressWarnings("unchecked")
	public Collection<User> findAll(){
		Query requete = entityManager.createNativeQuery("SELECT * FROM User" , User.class);
		return (Collection<User>)requete.getResultList();	
	}
	
	public User findUserById(int id){
		
		return entityManager.find(User.class, id);
		
	}

	public User findUserByEmail(String email) {
		Query requete = entityManager.createQuery(JPQL_SELECT_PAR_EMAIL); 
		requete.setParameter(PARAM_USER, email); 
		List<Integer> id_users = (List<Integer>)requete.getResultList();
		if(id_users != null && id_users.size() > 0)
			return entityManager.find(User.class, id_users.get(0));
		else
			return null;
		
	}

	public void notifyUsers(Announcement a) {
		String findall = "SELECT * FROM User";
		Query requete = entityManager.createNativeQuery(findall , User.class);
		List<User> users = requete.getResultList();
		Iterator<User> ite = users.iterator();
		while(ite.hasNext()){
			User u = ite.next();
			if(u.isInterested(a)){
				Notification tmp = new Notification();
				tmp.setContent("Une annonce peut potentiellement vous intéresser !\n" + a.getTitle());
				entityManager.persist(tmp);
				u.addWaitingNotification(tmp);
				u.addPotentiallyInterestingAnnouncement(a);
				entityManager.merge(u);
			}
		}
		
	}

}
