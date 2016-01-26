package com.imobAchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/admin")
	public String getAdmin(Model model){
		return "admin";
	}
	
	@RequestMapping("/admin/users")
	public String getUsers(Model model){
		return "adminUsers";
	}
	
	@RequestMapping("/admin/properties")
	public String getProperties(Model model){
		return "adminProperties";
	}
}
