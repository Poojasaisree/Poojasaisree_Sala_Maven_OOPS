package com.epam.new_year_gift;

public class Gifts extends Sweets{
	int count;

	public Gifts(String name, float weight, int price, int count) {
		super(name, weight, price);
		this.count = count;
	}

	public Gifts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gifts(String name, float weight, int price) {
		super(name, weight, price);
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Gifts [count=" + count + ", name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	

}
