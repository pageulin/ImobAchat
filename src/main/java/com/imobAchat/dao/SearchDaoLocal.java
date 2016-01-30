package com.imobAchat.dao;

import javax.ejb.Local;

import com.imobAchat.model.Search;

@Local
public interface SearchDaoLocal {

	public void save(Search s);
	public void edit(Search s);
	public void delete(Search s);
	public void delete(int id);
	
}
