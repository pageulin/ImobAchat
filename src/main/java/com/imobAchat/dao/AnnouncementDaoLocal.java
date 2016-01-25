package com.imobAchat.dao;

import java.util.Collection;

import javax.ejb.Local;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.User;

@Local
public interface AnnouncementDaoLocal {

	public void save(Announcement a);
	public Announcement findById(int id);
	public Collection<Announcement> findAll();
	public Collection<Announcement> findByUser(User u);
	
	
	
}
