package com.imobAchat.controller;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.UserService;
import com.imobAchat.dao.UserDao;
import com.imobAchat.model.User;

@Controller
@Scope("session")
public class UserController {

	@Autowired
	private UserService us;
	
	@EJB(name="UserDao")
	private UserDao ud;
	
	@ModelAttribute("registration")
	public User constructRegistrationUser(){
		return new User();
	}

	@ModelAttribute("login")
	public User constructLoginUser(){
		return new User();
	}
	
	@RequestMapping("/userInfo")
	public String getInfoOnUser(Model model){
		model.addAttribute("user", 1);
		return "userInfo";
	}
	
	@RequestMapping(value = "/registration", method=RequestMethod.POST)
	@Transactional
	public String registration(HttpServletRequest request, @ModelAttribute("registration") User user){
		//init.addUser(user);
		us.addUser(user);
		
        HttpSession session = request.getSession();
        session.setAttribute("user",user);

		return "searchProperty";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	@Transactional
	public String login(HttpServletRequest request, @ModelAttribute("login") User user){

		//us.addUser(user);
		
        HttpSession session = request.getSession();
        User u = us.findUserByEmail(user.getEmail());
        
        if(u != null && user != null && u.getPassWord().equals(user.getPassWord())){
	        session.setAttribute("user",u);
	        return "redirect:searchProperty";
        }
        
        return "login";
	}

	@RequestMapping(value = "/index", method=RequestMethod.POST)
	@Transactional
	public String logout(HttpServletRequest request){

        HttpSession session = request.getSession();
        session.removeAttribute("user");

        return "redirect:login";
	}
	
	@RequestMapping("/registration")
	public String getRegistration(Model model){
		us.addUser(new User());
		return "registration";
	}
	
	@RequestMapping("/login")
	public String getLogin(Model model){
		us.addUser(new User());
		return "login";
	}
	
}
