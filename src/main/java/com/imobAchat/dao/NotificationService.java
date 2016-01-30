package com.imobAchat.dao;

import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.Notification;

@Service
@Transactional
public class NotificationService {
	
	@EJB(name = "NotificationDao")
	private NotificationDaoLocal nD;
	
	public void save(Notification n){
		nD.save(n);
	}

}
