package com.imobAchat.controller;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.AnnouncementDao;
import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.model.Announcement;

@Controller
public class SubmitPropertyController {

	@Autowired
	private AnnouncementService as;
	
	@EJB(name="AnnouncementDao")
	private AnnouncementDao ad;
	
	@ModelAttribute("Announcement")
	public Announcement constructAnnouncement(){
		return new Announcement();
	}
	
	@RequestMapping(value = "/submitProperty", method=RequestMethod.POST)
	@Transactional
	public String submitAnnouncement(@ModelAttribute("Announcement") Announcement announcement){
		System.out.println("POST submitProperty");
		return "index";
	}

	@RequestMapping("/submitProperty")
	public String getSubmitProperty(Model model){
		System.out.println("load submit property");
		return "submitProperty";
	}
	
}
