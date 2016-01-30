package com.imobAchat.dao;

import javax.ejb.Local;

import com.imobAchat.model.Notification;

@Local
public interface NotificationDaoLocal {
	
	public void save(Notification n);


}
