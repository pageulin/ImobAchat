package com.imobAchat.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.model.Announcement;

@Controller
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)   // 50MB
public class SubmitPropertyController {

	@Autowired
	private AnnouncementService as;
	
	private static final String SAVE_DIR = "resources/images/property";
	
	@ModelAttribute("submitProperty")
	public Announcement constructAnnouncement(){
		return new Announcement();
	}
	
	@RequestMapping(value = "/submitProperty", method=RequestMethod.POST)
	@Transactional
	public String submitProperty(HttpServletRequest request, @ModelAttribute("submitProperty") Announcement announcement) throws IOException, ServletException{
		System.out.println("POST submitProperty");
		HttpSession session = request.getSession();
		com.imobAchat.model.User user = (com.imobAchat.model.User) session.getAttribute("user");
		announcement.setOwner(user);
		
        /* appPath = request.getServletContext().getRealPath("");
        String savePath = appPath + File.separator + SAVE_DIR;
         
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
         
        String fileName;
        int cpt = 0;
        for (Part part : request.getParts()) {
            //String fileName = extractFileName(part);
        	fileName = "property_" + user.getId() + "_" + announcement.getId() + "_" + cpt + ".jpg";
        	System.out.println(fileName);
            part.write(savePath + File.separator + fileName);
            announcement.addPicture(fileName);
            cpt++;
        }*/
		
		as.save(announcement);

		System.out.println(announcement);
		return "searchProperty";
	}

	@RequestMapping("/submitProperty")
	public String getSubmitProperty(Model model){
		System.out.println("load submit property");
		return "submitProperty";
	}
	
    /*private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }*/
	
}
