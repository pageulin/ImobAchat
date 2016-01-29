package com.imobAchat.dao;


import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.User;

@Service
@Transactional
public class AnnouncementService {

	@EJB(name="AnnouncementDao")
	private AnnouncementDaoLocal aD;
	
	@EJB(name="UserDao")
	private UserDaoLocal uD;
	
	public AnnouncementService(){
		aD = new AnnouncementDao();
	}

	@PostConstruct
	public void init(){
		Announcement a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setBathrooms(1);
		a.setBedrooms(1);
		a.setArea(50);
		a.setPrice(100000);
		a.setCountry("France");
		a.setTown("Paris");
		a.setAddress("15 Rue Bonaparte, Paris, France");
		a.setLongitude(2.3344796000000088);
		a.setLatitude(48.856205);
		a.addPicture("property6.jpg");
		User u = new User();
		u.setEmail("test@gmail.com");
		u.setPseudo("test");
		u.setLastName("lastName");
		u.setFirstname("firstName");
		a.setOwner(u);
		uD.addUser(u);
		aD.save(a);
		
		a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setCountry("France");
		a.setTown("Bordeaux");
		a.setBathrooms(1);
		a.setBedrooms(1);
		a.setArea(75);
		a.setPrice(50000);
		a.setAddress("18 Rue Judaïque, Bordeaux, France");
		a.setLongitude(-0.5818474000000151);
		a.setLatitude(44.84154530000001);
		a.addPicture("property1.jpg");
		a.setOwner(u);
		aD.save(a);
		
		a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setCountry("France");
		a.setTown("Paris");
		a.setBathrooms(1);
		a.setBedrooms(1);
		a.setArea(20);
		a.setPrice(8000);
		a.setAddress("35 Rue de Dunkerque, Paris, France");
		a.setLongitude(2.3518020000000206);
		a.setLatitude(48.8806403);
		a.addPicture("property2.jpg");
		a.setOwner(u);
		aD.save(a);
		
		a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setCountry("France");
		a.setTown("Paris");
		a.setBathrooms(2);
		a.setBedrooms(2);
		a.setArea(82);
		a.setPrice(60000);
		a.setAddress("15 Rue Bonaparte, Paris, France");
		a.setLongitude(2.3344796000000088);
		a.setLatitude(48.856205);
		a.addPicture("property3.jpg");
		a.setOwner(u);
		aD.save(a);
		
		a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setCountry("France");
		a.setTown("Paris");
		a.setBathrooms(1);
		a.setBedrooms(1);
		a.setArea(5);
		a.setPrice(1000000);
		a.setAddress("64 Rue de Rivoli, Paris, France");
		a.setLongitude(2.338296899999932);
		a.setLatitude(48.86188729999999);
		a.addPicture("property4.jpg");
		a.setOwner(u);
		aD.save(a);
		
		a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setCountry("France");
		a.setTown("Paris");
		a.setBathrooms(1);
		a.setBedrooms(2);
		a.setArea(500);
		a.setPrice(17);
		a.setAddress("15 Rue Bonaparte, Paris, France");
		a.setLongitude(2.3344796000000088);
		a.setLatitude(48.856205);
		a.addPicture("property5.jpg");
		a.setOwner(u);
		aD.save(a);
		
		a = new Announcement();
		a.setTitle("titre test");
		a.setDescription("description test");
		a.setCountry("France");
		a.setTown("Lille");
		a.setBathrooms(1);
		a.setBedrooms(1);
		a.setArea(580);
		a.setPrice(1000000);
		a.setAddress("36 Boulevard Vauban, Lille, France");
		a.setLongitude(3.0491528000000017);
		a.setLatitude(50.6366612);
		a.addPicture("property6.jpg");
		a.setOwner(u);
		aD.save(a);
	
		//System.out.println( aD.findByUser(u));
		
		aD.delete(a);
		
	}
	
	public Collection<Announcement> findAll(){
		return aD.findAll();
	}
	
	public Announcement findById(int id){
		return aD.findById(id);
	}
	
	public Collection<Announcement> findByUser(User user) {
		return aD.findByUser(user);
	}
	
	public void delete(Announcement a){
		aD.delete(a);
	}
	
	public void deleteById(int id){
		aD.deleteById(id);
	}
	
	public void save(Announcement a){
		aD.save(a);
	}
	
}
