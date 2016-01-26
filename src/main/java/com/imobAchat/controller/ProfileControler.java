package com.imobAchat.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.Announcement;

@Controller
public class ProfileControler {

	@Autowired
	private AnnouncementService as;
	@Autowired
	private UserService us;
	
	@ModelAttribute("updateUser")
	public com.imobAchat.model.User constructUser(){
		return new com.imobAchat.model.User();
	}
	
	@RequestMapping("/profile")
	@Transactional
	public String getProfile(HttpServletRequest request, Model model){
		HttpSession session = request.getSession();
		Collection<Announcement> announcements = as.findByUser((com.imobAchat.model.User)session.getAttribute("user"));
		request.setAttribute("announcements", announcements);
		return "profile";
	}
	
	@RequestMapping(value = "/updateUser", method=RequestMethod.POST)
	@Transactional
	public String updateUser(HttpServletRequest request,  @ModelAttribute("updateUser") com.imobAchat.model.User user){
		HttpSession session = request.getSession();
		com.imobAchat.model.User me = (com.imobAchat.model.User) session.getAttribute("user");
		
		me.setFirstname(user.getFirstname());
		me.setLastName(user.getLastName());
		me.setEmail(user.getEmail());
		me.setPseudo(user.getPseudo());
		me.setPhone(user.getPhone());
		
		session.setAttribute("user", me);
		
		System.out.println("Up");
		System.out.println(me);
		us.editUser(me);
		
		return "profile";
	}

}
