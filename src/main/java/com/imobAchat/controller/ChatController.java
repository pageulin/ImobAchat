package com.imobAchat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imobAchat.dao.UserService;
import com.imobAchat.model.User;

@Controller
public class ChatController {

	@Autowired
	private UserService us;
	
	@RequestMapping("/chat")
	public String getChat(HttpServletRequest request, Model model){
		HttpSession session = request.getSession();
		session.setAttribute("user", us.findUserById( ((User) session.getAttribute("user")).getId()));
		return "chat";
	}

	@RequestMapping("/conversation")
	public String getConversation(HttpServletRequest request,Model model){
		HttpSession session = request.getSession();
		session.setAttribute("user", us.findUserById( ((User) session.getAttribute("user")).getId()));
		return "conversation";
	}
}
