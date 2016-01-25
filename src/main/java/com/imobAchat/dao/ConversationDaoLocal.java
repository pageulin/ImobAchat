package com.imobAchat.dao;

import java.util.Collection;

import javax.ejb.Local;
import com.imobAchat.model.Conversation;
import com.imobAchat.model.User;

@Local
public interface ConversationDaoLocal {

	public Collection<Conversation> getConversationByUser(User u);
	public Collection<Conversation> findAll();
	public Conversation findById(int id);
	public void save(Conversation c);
	
}
