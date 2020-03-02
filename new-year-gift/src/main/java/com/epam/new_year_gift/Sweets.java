package com.epam.new_year_gift;

import java.util.ArrayList;

public class Sweets {
	String name;
	float weight;
	int price;


	public Sweets(String name, float weight, int price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	


	public Sweets() {
		super();
		
	}



	@Override
	public String toString() {
		return "Sweets [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getWeight() {
		return weight;
	}



	public void setWeight(float weight) {
		this.weight = weight;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}




}
