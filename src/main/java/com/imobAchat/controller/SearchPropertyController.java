package com.imobAchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchPropertyController {

	@RequestMapping("/searchProperty")
	public String getLogin(Model model){
		return "searchProperty";
	}
}
