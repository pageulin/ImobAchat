package com.imobAchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropertyDetailsController {

	@RequestMapping("/propertyDetails")
	public String getPropertyDetails(Model model){
		return "propertyDetails";
	}
}
