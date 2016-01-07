package com.imobAchat.dao;

import javax.ejb.Local;

import com.imobAchat.model.User;

@Local
public interface UserDaoLocal {

	public void addUser(User u);
	
	public void editUser(User u);
	
	public void deleteUser(int userId);
	
	public User findUserByEmail(String email);
	
	public User findUserById(int id);
	
}
