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

import com.imobAchat.dao.UserDao;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.User;

@Controller
public class SubmitPropertyController {

	@Autowired
	private UserService us;
	
	@EJB(name="UserDao")
	private UserDao ud;
	
	@ModelAttribute("Announcement")
	public User constructAnnouncement(){
		return new User();
	}
	
	@RequestMapping(value = "/submitProperty", method=RequestMethod.POST)
	@Transactional
	public String submitAnnouncement(@ModelAttribute("Announcement") User user){
		System.out.println("POST submitProperty");
		return "index";
	}

	@RequestMapping("/submitProperty")
	public String getSubmitProperty(Model model){
		System.out.println("load submit property");
		return "submitProperty";
	}
	
}
