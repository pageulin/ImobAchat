package com.imobAchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileControler {

	@RequestMapping("/profile")
	public String getLogin(Model model){
		return "profile";
	}
}
