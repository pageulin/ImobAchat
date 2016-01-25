package com.imobAchat.dao;

import java.util.Calendar;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.Conversation;
import com.imobAchat.model.Message;
import com.imobAchat.model.User;


@Service 
@Transactional
public class ConversationService {

	@EJB(name="ConversationDao")
	private ConversationDaoLocal cD;
	
	@EJB(name="MessageDao")
	private MessageDaoLocal mD;
	
	@EJB(name="UserDao")
	private UserDaoLocal uD;
	
	public ConversationService() {
		cD = new ConversationDao();
		mD = new MessageDao();
		uD = new UserDao();
	}
	
	@PostConstruct
	public void init(){
		
		Calendar cal = Calendar.getInstance();
		User u = new User();
		u.setAddress("test@conversation.com");
		u.setLastName("test conversation lastName");
		u.setFirstname("test conversation firstName");
		uD.addUser(u);
		User u2 = new User();
		u2.setAddress("test2@conversation.com");
		u2.setLastName("test2 conversation lastName");
		u2.setFirstname("test2 conversation firstName");
		uD.addUser(u2);
		Conversation c = new Conversation();
		Message m = new Message();
		m.setContent("msg 1");
		m.setDate(cal.getTime());
		m.setSender(u);
		mD.save(m);
		Message m2 = new Message();
		m2.setContent("msg 2");
		m2.setDate(cal.getTime());
		m2.setSender(u);
		mD.save(m2);
		
		c.setSubject("subject : conversation Test");
		c.setUser1(u);
		c.setUser2(u2);
		c.addMessage(m);
		c.addMessage(m2);
		cD.save(c);
		
		System.out.println(c);
		
		
	}
	
	public Collection<Conversation> getConversationByUser(User u){
		return cD.getConversationByUser(u);
	}
	
	public Collection<Conversation> findAll(){
		return cD.findAll();
	}
	
	public Conversation findById(int id){
		return cD.findById(id);
	}
	
	public void save(Conversation c){
		cD.save(c);
	}
	
}
