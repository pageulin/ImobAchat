package com.imobAchat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.Announcement;
import com.imobAchat.model.User;

@Controller
public class PropertyDetailsController {
	
	@RequestMapping("/propertyDetails")
	public String getPropertyDetails(Model model){
		return "propertyDetails";
	}
}
