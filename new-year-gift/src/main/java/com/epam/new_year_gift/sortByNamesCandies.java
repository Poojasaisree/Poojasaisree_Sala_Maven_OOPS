package com.epam.new_year_gift;

import java.util.Comparator;

public class sortByNamesCandies implements Comparator<Candies>{
	public int compare(Candies cd1, Candies cd2) {
		// TODO Auto-generated method stub
		return cd1.Name.compareTo(cd2.Name);
	}


}

