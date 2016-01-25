package com.imobAchat.controller;

import javax.ejb.EJB;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.UserService;
import com.imobAchat.dao.UserDao;
import com.imobAchat.model.User;

@Controller
public class UserController {

	@Autowired
	private UserService us;
	
	@EJB(name="UserDao")
	private UserDao ud;
	
	@ModelAttribute("registration")
	public User constructUser(){
		return new User();
	}
	
	@RequestMapping("/userInfo")
	public String getInfoOnUser(Model model){
		System.out.println(ud.findUserById(1));
		model.addAttribute("user", 1);
		System.out.println(ud.findUserByEmail("toto@gmail.com"));
		return "userInfo";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	@Transactional
	public String registration(@ModelAttribute("registration") User user){
		//init.addUser(user);
		us.addUser(user);
		return "index";
	}
	
	@RequestMapping("/login")
	public String getLogin(Model model){
		us.addUser(new User());
		return "login";
	}
	
	@RequestMapping("/index")
	public String getIndex(Model model){
		return "index";
	}
	
	@RequestMapping("/Admin")
	public String getAdmin(Model model){
		return "admin";
	}
	
}
