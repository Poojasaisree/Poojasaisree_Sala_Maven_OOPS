package com.epam.new_year_gift;

import java.util.Comparator;

public class sortByPriceSweets implements Comparator<Sweets> {

	public int compare(Sweets sw1, Sweets sw2) {
		// TODO Auto-generated method stub
		return sw1.price - sw2.price;
	}

}
