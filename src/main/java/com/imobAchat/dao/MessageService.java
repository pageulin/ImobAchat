package com.imobAchat.dao;

import java.util.Collection;

import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.Message;

@Service
@Transactional
public class MessageService {
	
	@EJB(name="MessageDao")
	private MessageDaoLocal md;
	
	public Message findById(int id){
		return md.findById(id);
	}
	
	public Collection<Message> findAll(){
		return md.findAll();
	}
	
	public void save(Message m){
		md.save(m);
	}
	

}
