package com.epam.new_year_gift;

public class Candies {
	
	public String Name;
	public float weight;
	public float price;
	public Candies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candies( String name, float weight, float price) {
		super();
		
		Name = name;
		this.weight = weight;
		this.price = price;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Candies [Name=" + Name + ", weight=" + weight + ", price=" + price + "]";
	}
	

}
