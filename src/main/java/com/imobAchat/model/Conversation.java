package com.imobAchat.model;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Conversation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private User user1;
	
	@OneToOne
	private User user2;
	
	@OneToMany
	private Collection<Message> messages = new ArrayList<Message>();
	
	private String subject;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	public User getUser2() {
		return user2;
	}
	public void setUser2(User user2) {
		this.user2 = user2;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void addMessage(Message msg){
		this.messages.add(msg);
	}
	
	public String toString(){
		
		String res = "";
		Iterator<Message> ite = this.messages.iterator();
		int i = 1;
		while(ite.hasNext()){
			res += "msg " + i + " : " + "\n" + ite.next().toString();
			i++;
		}
		return "subject : " + "\n" +
				this.subject + "\n" +
				"user 1 :" + "\n" +
				this.user1 + "\n" +
				"user 2 :" + "\n" +
				this.user2 + "\n" +
				res + "\n";
	}
}
