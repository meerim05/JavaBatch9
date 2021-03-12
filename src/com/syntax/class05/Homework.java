package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not.
		 * If you user does not have a credit card then offer them.
		 * If they do have one ask what is balance on the card?
		 * If blance of the card is larger than 1000;
		 * tell them to pay immediately, otherwise you can tell them they can spend more
		 *
		 */
		Scanner scan;
		boolean answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card(true/false)");
		
		answer=scan.nextBoolean();
		
		if(answer) {
			System.out.println("What is the balance on your card?");
			 balance=scan.nextDouble();
			 if(balance>1000) {
				 System.out.println("Please pay off your card?");
			 }else {
				 System.out.println("You can spend more money");
			 }
	}else {
		System.out.println("Would you like to get a credit card?");
	}
	}
}
