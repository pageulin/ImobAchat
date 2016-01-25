package com.imobAchat.dao;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.imobAchat.model.Message;

@Stateless
@Transactional
public class MessageDao implements MessageDaoLocal{

	@PersistenceContext
	EntityManager em;
	

	public Message findById(int id) {
		return em.find(Message.class, id);
	}

	public Collection<Message> findAll() {
		String Query = "SELECT * FROM Message";
		Query q = em.createNativeQuery(Query , Message.class);
		return q.getResultList();
	}

	public void save(Message m) {
		em.persist(m);	
	}

}
