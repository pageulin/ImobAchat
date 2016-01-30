package com.imobAchat.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.Search;

@Stateless
@Transactional
public class SearchDao implements SearchDaoLocal {

	@PersistenceContext
	private EntityManager em;
	
	public void save(Search s) {
		em.persist(s);
	}

	@Override
	public void delete(Search s) {
		if(s!=null){
			em.remove( em.merge(s));
		}
		
	}

	@Override
	public void delete(int id) {
		
		em.remove(em.merge(em.find(Announcement.class, id)));
		
	}

	@Override
	public void edit(Search s) {
		em.merge(s);
		
	}
	
	

}
