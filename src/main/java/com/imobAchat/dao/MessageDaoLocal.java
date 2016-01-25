package com.imobAchat.dao;

import java.util.Collection;

import javax.ejb.Local;

import com.imobAchat.model.Message;

@Local
public interface MessageDaoLocal {
	
	public Message findById(int id);
	public Collection<Message> findAll();
	public void save(Message m);

}
