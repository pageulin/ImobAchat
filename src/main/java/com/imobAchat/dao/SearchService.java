package com.imobAchat.dao;

import javax.ejb.EJB;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.imobAchat.model.Search;

@Service
@Transactional
public class SearchService {

	@EJB(name = "SearchDao")
	private SearchDaoLocal sD;
	
	public void save(Search s){
		sD.save(s);
	}
	
	public void delete(int id){
		sD.delete(id);
	}

	public void edit(Search s){
		sD.edit(s);
	}
	
	
}
