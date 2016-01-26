package com.imobAchat.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.model.Announcement;

import antlr.collections.List;

@Controller
public class SearchPropertyController {

	@Autowired
	private AnnouncementService as;
	
	@RequestMapping("/searchProperty")
	public String getLogin(HttpServletRequest request, Model model){
		Collection<Announcement> announcements = as.findAll();
		
		String makers = "";
		
        for(Announcement announcement : announcements){
        	if(makers != "")
        		makers += ",";
        	
        	Object picture;
        	Announcement announcement_cpy = announcement;
        	Object[] pictures_array = announcement_cpy.getPictures().toArray(); 
        	if(pictures_array.length > 0)
        		picture = pictures_array[0];
        	else
        		picture = "none.jpg";
        	
        	makers += "{'latitude': '" + announcement.getLatitude() + "'," + "\n" +

        			  "'longitude': '" + announcement.getLongitude() + "'," + "\n" +

        			  "'image': '<img src=\"resources/images/property/" + picture + "\" class=\"attachment-property-infobox\" />'," + "\n" +

        			  "'price_html': '<span class=\"amount\">" + announcement.getPrice() + " €</span> '," + "\n" +
        			  
        			  "'title': '" + announcement.getTitle() + "'," + "\n" +

        			  "'area': '" + announcement.getArea() + " sqft'," + "\n" +

        			  "'bedrooms': '" + announcement.getBedrooms() + "'," + "\n" +

        			  "'bathrooms': '" + announcement.getBathrooms() + "'," + "\n" +

        			  "'price': '" + announcement.getPrice() + "'," + "\n" +

        			  "'url': 'property-details.html'," + "\n" +

        			  "'icon': 'resources/images/icon/marker-icon-coop.png' }";
        }

		request.setAttribute("makers", makers);
		return "searchProperty";
	}
}
