package com.imobAchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imobAchat.model.User;

@Controller
public class ActualityController {
	
	@RequestMapping("/actuality")
	public String getLogin(Model model){
		return "actuality";
	}
}
