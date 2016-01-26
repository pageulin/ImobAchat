package com.imobAchat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.model.Announcement;

@Controller
public class PropertyDetailsController {

	@Autowired
	private AnnouncementService as;
	
	@RequestMapping("/propertyDetails")
	public String getPropertyDetails(Model model){
		return "propertyDetails";
	}
}
