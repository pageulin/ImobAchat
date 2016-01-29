package com.imobAchat.controller;

import java.util.*;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.Announcement;
import com.imobAchat.model.User;

@Controller
public class ActualityController {
	
	@Autowired
	private AnnouncementService as;
	
	@Autowired
	private UserService us;
	
	@ModelAttribute("propertyDetails")
	public Announcement constructAnnouncement(){
		return new Announcement();
	}
	
	@RequestMapping("/actuality")
	public String getLogin(HttpServletRequest request, Model model){
		Collection<Announcement> announcements = as.findAll();
		Collections.reverse((java.util.List<?>) announcements);
		request.setAttribute("announcements", announcements);
		return "actuality";
	}
	
	private boolean isFavorite(User u, int announcement_id){
		Object[] l = u.getFavoriteAnnouncements().toArray();
		boolean isFavorite = false;
		int i=0;
		while(i<l.length && isFavorite == false){
			if(((Announcement)l[i]).getId() == announcement_id){
				isFavorite = true;
				System.out.println("id find : " + ((Announcement)l[i]).getId());
			}
			 ++i;
		}
		return isFavorite;
	}
	
	@RequestMapping("/actuality/{id}")
	public String getPropertyDetails(Model model,HttpServletRequest request, @PathVariable("id") Integer id){
		System.out.println(id);
		HttpSession session = request.getSession();
		
		if(id != null){
			Announcement announcement = as.findById(id);
			request.setAttribute("announcement", announcement);
			session.setAttribute("announcement", announcement);
			System.out.println(announcement);
		}
		
		
		User u = (User) session.getAttribute("user");
		boolean isFavorite = isFavorite(u,id);
		
		request.setAttribute("isFavorite", isFavorite);
		session.setAttribute("isFavorite", isFavorite);
		
		session.setAttribute("id", id);
		
		return "redirect:../propertyDetails";
	}
	
	@RequestMapping("/favorite/{id}/{cmd}")//removeFavorite
	public String addAnnouncementFavorit(Model model,HttpServletRequest request, @PathVariable("id") Integer id,@PathVariable("cmd") String cmd){
		System.out.println(id);
		request.setAttribute("id", id);
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user"); // we fetch the current user 
		Announcement a = as.findById(id); // we fetch the announcement selected 
		if(cmd.equals("addFavorite"))
			u.addFavoriteAnnouncement(a); //we add the announcment to the favorit announcment list
		else
			u.removeFavoriteAnnouncement(a.getId()); //we remove the announcment to the favorit announcment list
		us.editUser(u); // we save in data base the user updated
		session.setAttribute("user",u); // we save in session variable the user updated
		
		//request.setAttribute("announcement", a);
		session.setAttribute("announcement", a);
		
		session.setAttribute("id", id);
		
		boolean isFavorite = isFavorite(u,id);
		
		//request.setAttribute("isFavorite", isFavorite);
		session.setAttribute("isFavorite", isFavorite);
		
		return "redirect:../../propertyDetails";
	}
}
