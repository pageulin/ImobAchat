package com.imobAchat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Search {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int bedrooms = 0;
	private int bathrooms = 0;
	private int min_area = 0;
	private int max_area = 0;
	private int min_price = 0;
	private int max_price = 0;
	private String country;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	private String town;
	
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public int getMin_area() {
		return min_area;
	}
	public void setMin_area(int min_area) {
		this.min_area = min_area;
	}
	public int getMax_area() {
		return max_area;
	}
	public void setMax_area(int max_area) {
		this.max_area = max_area;
	}
	public int getMin_price() {
		return min_price;
	}
	public void setMin_price(int min_price) {
		this.min_price = min_price;
	}
	public int getMax_price() {
		return max_price;
	}
	public void setMax_price(int max_price) {
		this.max_price = max_price;
	}
	
	public void cloneSearch(Search s){
		s.bathrooms = this.bathrooms;
		s.bedrooms = this.bedrooms;
		s.country = this.country;
		s.max_area = this.max_area;
		s.min_area = this.min_area;
		s.max_price = this.max_price;
		s.min_price = this.min_price;
		s.town = this.town;
	}
	
	public String toString(){
		return "Search : " + "\n" + 
		"bedrooms : " + bedrooms + "\n" +
		"bathrooms : " + bathrooms + "\n" +
		"min_area : " + min_area + "\n" +
		"max_area : "+ max_area + "\n" +
		"min_price : "+ min_price + "\n" +
		"max_price :"+ max_price + "\n" +
		"country : "+ country + "\n";
		
	}
}
