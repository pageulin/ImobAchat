package com.imobAchat.controller;

import java.util.Collection;
import java.util.Iterator;

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
import com.imobAchat.dao.NotificationService;
import com.imobAchat.dao.SearchService;
import com.imobAchat.dao.UserDao;
import com.imobAchat.model.User;
import com.imobAchat.model.Notification;
import com.imobAchat.model.Search;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService us;
	
	@Autowired
	private NotificationService ns;

	@Autowired
	private SearchService ss;
	
	
	@RequestMapping("/login")
	public String getLogin(HttpServletRequest request , Model model){
	
		return "login";
	}	
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request , Model model){
	
		return "redirect:searchProperty";
	}	
	
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
	

	@RequestMapping("/notification")
	public String getNotification(HttpServletRequest request, Model model){
		
        HttpSession session = request.getSession();
        User current_user = (User) session.getAttribute("user");
        User u = us.findUserById(current_user.getId());
        
        List<Notification> lntmp = u.getNotifications();
        List<Notification> lwntmp = u.getWaitingNotifications();
        Iterator<Notification> ite = lwntmp.iterator();
        while(ite.hasNext()){
        	lntmp.add(ite.next());
        }
        
        lwntmp.clear();
        
        us.editUser(u);
        //Collection<com.imobAchat.model.Notification> list = u.getNotifications();
        //for(com.imobAchat.model.Notification n : list)
     	//  System.out.println("not : " + n.toString());
        
        //request.setAttribute("notifications", u.getNotifications());
        session.setAttribute("user", u);
		return "notification";
	}
	
}
