package com.imobAchat.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.imobAchat.dao.AnnouncementService;
import com.imobAchat.dao.UserService;
import com.imobAchat.model.Announcement;

@Controller
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)   // 50MB
public class SubmitPropertyController {

	@Autowired
	private AnnouncementService as;
	
	@Autowired
	private UserService us;
	
    @Autowired
    ServletContext context;
	
	//private static final String SAVE_DIR = "resources" + File.separator + "images " + File.separator + " property";
	private static final String SAVE_DIR = "src" + File.separator + "main" + File.separator + "webapp" + File.separator + "resources" + File.separator + "images" + File.separator + "property";

	@ModelAttribute("submitProperty")
	public Announcement constructAnnouncement(){
		return new Announcement();
	}
	
	public void saveFile(MultipartFile file, String name){
        try {
            byte[] bytes = file.getBytes();
            String path = SAVE_DIR + File.separator + name;
            System.out.println(path);
            BufferedOutputStream stream =
                    new BufferedOutputStream(new FileOutputStream(new File(path)));
            stream.write(bytes);
            stream.close();
            System.out.println("You successfully uploaded " + name + "!");
        } catch (Exception e){
            System.out.println("You failed to upload " + name + " => " + e.getMessage());
        }
    }
	
	@RequestMapping("/connect")
	public String connect(HttpServletRequest request, Model model){
		return "redirect:login";
		
	}
	
	@RequestMapping(value = "/submitProperty", method=RequestMethod.POST)
	@Transactional
	public String submitProperty(HttpServletRequest request, 
								 @ModelAttribute("submitProperty") Announcement announcement,
								 @RequestParam("file") MultipartFile[] files) throws IOException, ServletException{
		
		System.out.println("POST submitProperty");
		HttpSession session = request.getSession();
		com.imobAchat.model.User user = (com.imobAchat.model.User) session.getAttribute("user");
		announcement.setOwner(user);
		
		int cpt = 0;
		for(MultipartFile file : files){
			if (!file.isEmpty()) {
				String fileName = "property_" + user.getId() + "_" + cpt + ".jpg";
				saveFile(file,fileName);
				announcement.addPicture(fileName);
				cpt++;
			}
		}
		
		as.save(announcement);
		
		us.notifyUsers(announcement);

		System.out.println("return");
		return "redirect:searchProperty";
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
