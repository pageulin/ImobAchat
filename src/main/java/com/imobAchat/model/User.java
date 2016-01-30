package com.imobAchat.model;


import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mysql.jdbc.CacheAdapter;

import javax.persistence.JoinTable;



@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String phone;
	
	private String address;
	
	@OneToMany
	@JoinTable(name="user_favoriteAnnouncements")
	private List<Announcement> favoriteAnnouncements = new ArrayList<Announcement>();
	
	@OneToMany
	@JoinTable(name="user_potentiallyInterestingAnnouncements")
	private List<Announcement> potentiallyInterestingAnnouncements = new ArrayList<Announcement>();
	
	@OneToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="user_notifications")
	private List<Notification> notifications = new ArrayList<Notification>();
	
	@OneToMany( fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinTable(name="user_waitingNotifications")
	private List<Notification> waitingNotifications = new ArrayList<Notification>();
	

	private String email;
	
	private String pseudo;

	private String firstname;
	
	private String lastName;
	
	private String passWord;
	
	@OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	private Search search;

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
		System.out.println("set pass : " + passWord);
		this.passWord = passWord;
	}

	public String toString(){
		return "firstname : " + "\n" +
				firstname + "\n" +
				"lastname : " + "\n" + 
				lastName + "\n" +
				"email : " + "\n" +
				email + "\n" +
				"password : " + "\n" +
				passWord + "\n";
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
	
	public boolean removeFavoriteAnnouncement(Announcement a){
		return this.favoriteAnnouncements.remove(a);
	}
	
	public void removeFavoriteAnnouncement(int id){
		for(int i=0; i< favoriteAnnouncements.size(); ++i){
			if(id == favoriteAnnouncements.get(i).getId())
				favoriteAnnouncements.remove(favoriteAnnouncements.get(i));
		}
	}

	public List<Notification> getWaitingNotifications() {
		return waitingNotifications;
	}

	public void setWaitingNotifications(List<Notification> waitingNotifications) {
		this.waitingNotifications = waitingNotifications;
	}
	
	public void addWaitingNotification(Notification n){
		if(this.waitingNotifications == null)
			this.waitingNotifications = new ArrayList<Notification>();
		this.waitingNotifications.add(n);
	}
	
	public void removeWaitingNotifications(Notification n ){
		if(this.waitingNotifications == null)
			this.waitingNotifications.remove(n);
	}
	
	public void removeWaitingNotifications(int id ){
		if(this.waitingNotifications == null){
			for(int i=0; i< this.waitingNotifications.size(); ++i){
				if(id == this.waitingNotifications.get(i).getId())
					this.waitingNotifications.remove(this.waitingNotifications.get(i));
			}
		}
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	
	public void addNotification(Notification n){
		if(this.notifications == null)
			this.notifications = new ArrayList<Notification>();
		
		this.notifications.add(n);
	}
	
	public void removeNotification(Notification n){
		if(this.notifications != null)
			this.notifications.remove(n);
	}
	
	public void removeNotification(int id){
		if(this.notifications != null){
			for(int i=0; i< this.notifications.size(); ++i){
				if(id == this.notifications.get(i).getId())
					this.notifications.remove(this.notifications.get(i));
			}
		}
	}

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search s) {
		this.search = s;
	}
	
	public void copySearch(Search s){
		s.cloneSearch(this.search);
	}
	
	public List<Announcement> getPotentiallyInterestingAnnouncements() {
		return potentiallyInterestingAnnouncements;
	}

	public void setPotentiallyInterestingAnnouncements(List<Announcement> potentiallyInterestingAnnouncements) {
		this.potentiallyInterestingAnnouncements = potentiallyInterestingAnnouncements;
	}

	public void addPotentiallyInterestingAnnouncement(Announcement a){
		if(a != null){
			if(this.potentiallyInterestingAnnouncements == null)
				this.potentiallyInterestingAnnouncements = new ArrayList<Announcement>();
			this.potentiallyInterestingAnnouncements.add(a);
				
		}
	}
	
	public boolean isInterested(Announcement a){
		if(this.search != null){
			
			if(a.getPrice() < this.search.getMax_price() + this.search.getMax_price()/10 ){
				if(a.getArea() - a.getArea()/10 >= this.search.getMin_area()){
				
					if(a.getBathrooms() + 1 >= this.search.getBathrooms()){
						
						if(a.getBedrooms() + 1 >= this.search.getBedrooms()){
							
							if(a.getCountry().equals(this.search.getCountry()) || a.getCountry().equals("") || this.search.getCountry().equals("")){
								
								return true;
							}
								
						}
					}
				}
			}
			return false;
		}
	return false;
	}
	
	
}
