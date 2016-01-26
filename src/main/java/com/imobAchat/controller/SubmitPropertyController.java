package com.imobAchat.controller;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.AnnouncementDao;
import com.imobAchat.dao.AnnouncementDaoLocal;
import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.Announcement;

@Controller
public class SubmitPropertyController {

	@Autowired
	private AnnouncementService as;
	
	@ModelAttribute("submitProperty")
	public Announcement constructAnnouncement(){
		return new Announcement();
	}
	
	@RequestMapping(value = "/submitProperty", method=RequestMethod.POST)
	@Transactional
	public String submitProperty(HttpServletRequest request, @ModelAttribute("submitProperty") Announcement announcement){
		System.out.println("POST submitProperty");
		HttpSession session = request.getSession();
		announcement.setOwner((com.imobAchat.model.User) session.getAttribute("user"));
		as.save(announcement);

		System.out.println(announcement);
		return "searchProperty";
	}

	@RequestMapping("/submitProperty")
	public String getSubmitProperty(Model model){
		System.out.println("load submit property");
		return "submitProperty";
	}
	
}
