package com.imobAchat.model;

import javax.persistence.Entity;

public class Search {

	private int bedrooms;
	private int bathrooms;
	private int min_area;
	private int max_area;
	private int min_price;
	private int max_price;
	
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
	
}
