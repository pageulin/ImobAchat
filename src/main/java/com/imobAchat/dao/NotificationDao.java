package com.imobAchat.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.imobAchat.model.Notification;

@Stateless
@Transactional
public class NotificationDao implements NotificationDaoLocal {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Notification n) {
		em.persist(n);
		
	}

}
