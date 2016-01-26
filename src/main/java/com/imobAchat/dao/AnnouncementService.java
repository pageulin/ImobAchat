package com.imobAchat.dao;


import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.User;

@Service
@Transactional
public class AnnouncementService {

	@EJB(name="AnnouncementDao")
	private AnnouncementDaoLocal aD;
	
	@EJB(name="UserDao")
	private UserDaoLocal uD;
	
	public AnnouncementService(){
		aD = new AnnouncementDao();
	}

	@PostConstruct
	public void init(){
		Announcement a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		User u = new User();
		u.setEmail("testAnnouncement@gmail.com");
		u.setPseudo("test announcement");
		u.setLastName("test lastName");
		u.setFirstname("test firstName");
		a.setOwner(u);
		uD.addUser(u);
		aD.save(a);
		
		System.out.println( aD.findByUser(u));
		
		aD.delete(a);
		
	}
	
	public Collection<Announcement> findAll(){
		return aD.findAll();
	}
	
	public Announcement findById(int id){
		return aD.findById(id);
	}
	
	public void delete(Announcement a){
		aD.delete(a);
	}
	
	public void deleteById(int id){
		aD.deleteById(id);
	}
	
}
