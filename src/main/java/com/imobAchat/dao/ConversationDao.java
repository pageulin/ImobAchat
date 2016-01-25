package com.imobAchat.dao;

import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.Conversation;
import com.imobAchat.model.User;

@Stateless
@Transactional
public class ConversationDao implements ConversationDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

	public Collection<Conversation> getConversationByUser(User u) {
		
		String query = "SELECT * FROM Announcement WHERE user1_id=? OR user2_id=?";
		Query q = em.createNativeQuery(query, Conversation.class);
		q.setParameter(1, u.getId());
		q.setParameter(2, u.getId());
		Collection<Conversation> conversations = (List<Conversation>)q.getResultList();
		
		return conversations;
	}

	public Collection<Conversation> findAll() {
		String query = "SELECT * FROM Announcement";
		Query q = em.createNativeQuery(query, Conversation.class);
		List<Conversation> resultList = (List<Conversation>)q.getResultList();
		return resultList;
	}

	public Conversation findById(int id) {
		return em.find(Conversation.class, id);
	}

	public void save(Conversation c) {
		em.persist(c);
		
	}

	
	
	
}
