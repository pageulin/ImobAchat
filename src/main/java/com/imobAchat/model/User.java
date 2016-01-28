package com.imobAchat.model;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String phone;
	
	private String address;
	
	@OneToMany
	private List<Announcement> favoriteAnnouncements;
	
	private String email;
	
	private String pseudo;

	private String firstname;
	
	private String lastName;
	
	private String passWord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String toString(){
		return "firstname : " + "\n" +
				firstname + "\n" +
				"lastname : " + "\n" + 
				lastName + "\n" +
				"email : " + "\n" +
				email + "\n";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Announcement> getFavoriteAnnouncements() {
		return favoriteAnnouncements;
	}

	public void setFavoriteAnnouncements(List<Announcement> favoriteAnnouncements) {
		this.favoriteAnnouncements = favoriteAnnouncements;
	}
	
	public void addFavoriteAnnouncement(Announcement a){
		this.favoriteAnnouncements.add(a);
	}
	
	public void removeFavoriteAnnouncement(Announcement a){
		this.favoriteAnnouncements.remove(a);
	}
	
	
	
}
