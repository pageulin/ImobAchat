package com.imobAchat.dao;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.User;

@Stateful
@Transactional
public class AnnouncementDao implements AnnouncementDaoLocal{

	@PersistenceContext
	EntityManager entityManager;

	public Announcement findById(int id){
		return entityManager.find(Announcement.class, id);
	}
	
	public void save(Announcement a) {
					
		entityManager.persist(a);
	
	}

	@Override
	public Collection<Announcement> findAll() {
		Query requete = entityManager.createNativeQuery("SELECT * FROM Announcement" , Announcement.class);
		return (List<Announcement>)requete.getResultList();
	}

	@Override
	public Collection<Announcement> findByUser(User u) {
		String query = "SELECT * FROM Announcement WHERE owner_id=?";
		Query q = entityManager.createNativeQuery(query, Announcement.class);
		q.setParameter(1, u.getId());
		Collection<Announcement> announcements = (List<Announcement>)q.getResultList();
		/*Iterator<Announcement> ite = announcements.iterator(); 
		while(ite.hasNext()){
			System.out.println( ite.next());
		}*/
		return announcements;
	}

	@Override
	public void delete(Announcement a) {
		entityManager.remove(entityManager.contains(a) ? a : entityManager.merge(a));
		
	}

	@Override
	public void deleteById(int id) {
		entityManager.remove(entityManager.find(Announcement.class, id));
		
	}
	
	

	
	
	
}
