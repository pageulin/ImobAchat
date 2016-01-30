package com.imobAchat.dao;

import java.util.Collection;

import javax.ejb.Local;

import com.imobAchat.model.Announcement;
import com.imobAchat.model.Notification;
import com.imobAchat.model.Search;
import com.imobAchat.model.User;

@Local
public interface UserDaoLocal {

	public void addUser(User u);
	
	public void editUser(User u);
	
	public void deleteUser(int userId);
	
	public User findUserByEmail(String email);
	
	public User findUserById(int id);
	
	public Collection<User> findAll();
	
	public void notifyUsers(Announcement a);
	
	
}
