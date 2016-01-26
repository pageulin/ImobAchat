package com.imobAchat.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.model.Announcement;

@Controller
public class ActualityController {
	
	@Autowired
	private AnnouncementService as;
	
	@ModelAttribute("propertyDetails")
	public Announcement constructAnnouncement(){
		return new Announcement();
	}
	
	@RequestMapping("/actuality")
	public String getLogin(HttpServletRequest request, Model model){
		Collection<Announcement> announcements = as.findAll();
		request.setAttribute("announcements", announcements);
		return "actuality";
	}
	
	@RequestMapping("/actuality/{id}")
	public String getPropertyDetails(Model model,HttpServletRequest request, @PathVariable("id") Integer id){
		System.out.println(id);
		if(id != null){
			Announcement announcement = as.findById(id);
			request.setAttribute("announcement", announcement);
			System.out.println(announcement);
		}
		return "propertyDetails";
	}
}
