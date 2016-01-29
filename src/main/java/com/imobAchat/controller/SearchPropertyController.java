package com.imobAchat.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.model.Announcement;
import com.imobAchat.model.Search;

import antlr.collections.List;

@Controller
public class SearchPropertyController {

	@Autowired
	private AnnouncementService as;
	
	@ModelAttribute("Search")
	public Search constructSearch(){
		return new Search();
	}

	public String createStringMakers(Collection<Announcement> announcements){
		
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

        			  "'url': 'actuality/" + announcement.getId() + "'," + "\n" +

        			  "'icon': 'resources/images/icon/marker-icon-coop.png' }";
        }
        
        return makers;
	}
	
	@RequestMapping("/searchProperty")
	public String searchProperty(HttpServletRequest request, Model model){
		Collection<Announcement> announcements = as.findAll();
		String makers = createStringMakers(announcements);
        request.setAttribute("makers", makers);
		return "searchProperty";
	}

	@RequestMapping(value = "/Search", method=RequestMethod.POST)
	public String Search(HttpServletRequest request,  @ModelAttribute("Search") Search s){
		System.out.println("Filter");
		Collection<Announcement> announcements = as.findAll();
		
		System.out.println("country search" + s.getCountry());
		ArrayList<Announcement> announcements_filter = new ArrayList<Announcement>();
        for(Announcement announcement : announcements){
        	if(announcement.getBedrooms() == s.getBedrooms() &&
        	   announcement.getBathrooms() == s.getBathrooms() && 
        	   announcement.getPrice() >= s.getMin_price() &&
        	   announcement.getPrice() <= s.getMax_price() &&
        	   announcement.getArea() >= s.getMin_area() &&
        	   announcement.getArea() <= s.getMax_area() &&
        	   s.getCountry().equals("") || announcement.getCountry().equalsIgnoreCase(s.getCountry())){
        		announcements_filter.add(announcement);
        	}
        }
		
		String makers = createStringMakers(announcements_filter);
        request.setAttribute("makers", makers);
		return "searchProperty";
	}
}
