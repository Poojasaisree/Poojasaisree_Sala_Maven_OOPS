package com.epam.new_year_gift;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NewYearGifts {

	static int countOfSweets;
	static int countOfCandies;
	static int countOfGifts;
	
	static List<Sweets> sweets = new ArrayList<Sweets>();
	static List<Candies> candies = new ArrayList<Candies>();
	static List<Gifts> gifts = new ArrayList<Gifts>();
	Scanner sc = new Scanner(System.in);
	
	static int flag = 1;
	
	public void input() {
		NewYearGifts nyg = new NewYearGifts();
		nyg.enterSweets(sweets);
		nyg.enterCandies(candies);
		nyg.enterGifts(gifts);
		
		while(flag == 1) {
			System.out.println("Enter your choice: 1. Dislay all the candies according to their names  2.Display all the sweets according to their price 3.Display all the gifts according to their count  4.Exit");
			int input = sc.nextInt();
			nyg.choice(input);
		}
		
	}


	public void choice(int input) {
		switch(input)  {
		case 1:
			Collections.sort(candies, new sortByNamesCandies());
			for(int i =0;i<countOfCandies;i++) {
				System.out.println(candies.get(i) + " ");
				
			}
			break;
		
		case 2:
			Collections.sort(sweets, new sortByPriceSweets());
		// TODO Auto-generated method stub
			for(int i =0;i<countOfSweets;i++) {
				System.out.println(sweets.get(i) + " ");
				
			}
			break;
		case 3:
			Collections.sort(gifts, new sortByCount());
			for(int i =0;i<countOfGifts;i++) {
				System.out.println(gifts.get(i) + " ");
				
			}
			break;
		case 4:
			flag = 0;
			break;
		default:
			System.out.println("Select valid option");
			break;
		}
		
	}


	public void enterGifts(List<Gifts> gifts) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of gifts");
		countOfGifts = sc.nextInt();
		System.out.println("Enter the name , weight , price, count  of the gift");
		for(int i =0;i<countOfGifts;i++) {
			Gifts gf = new Gifts(sc.next(),sc.nextFloat(),sc.nextInt(),sc.nextInt());
			gifts.add(gf);
			
		}
		
	}


	public void enterCandies(List<Candies> candies) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of candies");
		countOfCandies = sc.nextInt();
		System.out.println("Enter the name , weight , price of the candy");
		for(int i =0;i<countOfCandies;i++) {
			Candies cd = new Candies(sc.next(),sc.nextFloat(),sc.nextFloat());
			candies.add(cd);
			
		}
		
		
	}


	public void enterSweets(List<Sweets> sweets) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of sweets");
		countOfSweets = sc.nextInt();
		System.out.println("Enter the name , weight , price of the sweet");
		for(int i =0;i<countOfSweets;i++) {
			Sweets sw = new Sweets(sc.next(),sc.nextFloat(),sc.nextInt());
			sweets.add(sw);
			
		}
		
	}
	
	
	

}
