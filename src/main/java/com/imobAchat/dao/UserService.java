package com.imobAchat.dao;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.Notification;
import com.imobAchat.model.Search;
import com.imobAchat.model.User;

@Service
@Transactional
public class UserService {

	//@Autowired
	@EJB(name="UserDao")
	private UserDaoLocal uD;
	
	@EJB(name = "NotificationDao")
	private NotificationDaoLocal nD;
	
	@EJB(name="AnnouncementDao")
	private AnnouncementDaoLocal aD;
	
	@Autowired
	private SearchService ss;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		uD = new UserDao();
	}
	
	public void addUser(User u){
		uD.addUser(u);
	}
	
	@PostConstruct
	public void init(){

		User u = new User();
		u.setEmail("admin@gmail.com");
		u.setPassWord("admin");
		u.setFirstname("admin");
		u.setLastName("admin");
		u.setPseudo("admin");
		
		User o = new User();
		o.setEmail("owner@gmail.com");
		o.setPassWord("owner");
		o.setFirstname("owner");
		o.setLastName("owner");
		o.setPseudo("owner");
		
		Notification n = new Notification();
		n.setContent("Test Notification !!!");
		
		Announcement a = new Announcement();
		a.setTitle("Favorite test");
		a.setDescription("description test favorite");
		a.setCountry("France");
		a.setTown("Paris");
		a.setAddress("15 Rue Bonaparte, Paris, France");
		a.setLongitude(2.3344796000000088);
		a.setLatitude(48.856205);
		a.addPicture("property6.jpg");	
		
		
		Announcement b = new Announcement();
		b.setTitle("titre test");
		b.setDescription("description test");
		b.setCountry("France");
		b.setTown("Paris");
		b.setAddress("15 Rue Bonaparte, Paris, France");
		b.setLongitude(2.3344796000000088);
		b.setLatitude(48.856205);
		b.addPicture("property5.jpg");	
		
		
		Search s = new Search();
		s.setBathrooms(1);
		s.setBedrooms(1);
		s.setMin_price(0);
		s.setMax_price(1000000);
		s.setMin_area(0);
		s.setMax_area(1000);
		
	
		//ss.save(s);
		aD.save(a);
		aD.save(b);
		
		uD.addUser(o);
		u.setSearch(s);
		u.addWaitingNotification(n);
		u.addFavoriteAnnouncement(a);
		u.addPotentiallyInterestingAnnouncement(b);
		uD.addUser(u);
		
		b.setOwner(o);
		aD.edit(b);
		
		
		
		System.out.println(u);
		//System.out.println(uD.findUserByEmail("a").getEmail());
	}

	public void editUser(User u) {
		uD.editUser(u);
		
	}

	public void deleteUser(int userId) {
		uD.deleteUser(userId);
	}
	
	public Collection<User> findAll(){
		return uD.findAll();
	}

	public User findUserByEmail(String email) {
		return uD.findUserByEmail(email);
	}

	public User findUserById(int id) {
		return uD.findUserById(id);
	}
	
	public void notifyUsers(Announcement a){
		uD.notifyUsers(a);
	}
	
}
