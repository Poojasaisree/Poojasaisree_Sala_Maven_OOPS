package com.epam.new_year_gift;

import java.util.Comparator;

public class sortByCount implements Comparator<Gifts> {

	public int compare(Gifts gf1, Gifts gf2) {
		// TODO Auto-generated method stub
		return gf1.count - gf2.count;
	}

}
