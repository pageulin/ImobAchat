package com.imobAchat.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.imobAchat.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.Announcement;

import javassist.bytecode.Descriptor.Iterator;

@Controller
public class AdminController {
	
	@Autowired
	private AnnouncementService as;
	@Autowired
	private UserService us;
	
	@RequestMapping("/admin")
	public String getAdmin(HttpServletRequest request, Model model){
		HttpSession session = request.getSession();
		session.setAttribute("user", us.findUserById( ((User) session.getAttribute("user")).getId()));
		Collection<Announcement> announcements = as.findAll();
		Collection<User> users = us.findAll();
		request.setAttribute("nb_announcements", announcements.size());
		request.setAttribute("nb_users", users.size());
		return "admin";
	}
	
	@RequestMapping("/adminUsers")
	public String getUsers(HttpServletRequest request, Model model){
		Collection<com.imobAchat.model.User> users = us.findAll();
		Collection<Announcement> announcements = as.findAll();
		request.setAttribute("users", users);
		request.setAttribute("nb_announcements", announcements.size());
		request.setAttribute("nb_users", users.size());
		HttpSession session = request.getSession();
		session.setAttribute("user", us.findUserById( ((User) session.getAttribute("user")).getId()));
		return "adminUsers";
	}
	
	@RequestMapping("/adminProperties")
	public String getProperties(HttpServletRequest request, Model model){
		Collection<Announcement> announcements = as.findAll();
		Collection<com.imobAchat.model.User> users = us.findAll();
		request.setAttribute("announcements", announcements);
		request.setAttribute("nb_announcements", announcements.size());
		request.setAttribute("nb_users", users.size());
		HttpSession session = request.getSession();
		session.setAttribute("user", us.findUserById( ((User) session.getAttribute("user")).getId()));
		return "adminProperties";
	}
}
