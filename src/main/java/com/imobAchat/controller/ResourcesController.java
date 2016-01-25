package com.imobAchat.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imobAchat.dao.AnnouncementDaoLocal;
import com.imobAchat.dao.ConversationDaoLocal;
import com.imobAchat.dao.UserDaoLocal;
import com.imobAchat.model.Announcement;
import com.imobAchat.model.Conversation;

@RestController
@RequestMapping("/ressources")
public class ResourcesController {
	
	@EJB(name = "UserDao")
	private UserDaoLocal uD;
	
	@EJB(name = "ConversationDao")
	private ConversationDaoLocal cD;
	
	@EJB(name = "AnnouncementDao")
	private AnnouncementDaoLocal aD;
	
	@RequestMapping(value="/getFavoriteAnnouncement/:user_id" , method = RequestMethod.GET, produces = "application/json")
	public List<Announcement> getFavoriteAnnouncements(@RequestParam("user_id") int id){
		return uD.findUserById(id).getFavoriteAnnouncements();
	}
	
	@RequestMapping(value="/getConversationByUser/:user_id" , method = RequestMethod.GET, produces = "application/json")
	public List<Conversation> getConversationByUser(@RequestParam("user_id") int id){
		return (List<Conversation>)cD.getConversationByUser(uD.findUserById(id));
	}
	
	@RequestMapping(value="/getAllAnnouncements" , method = RequestMethod.GET, produces = "application/json")
	public List<Announcement> getAllAnnouncements(){
		return (List<Announcement>) aD.findAll();
	}
	

}
