package com.syntax.class04;

public class Task01 {

	public static void main(String[] args) {

		boolean diploma = true;
		double GPAscore = 3.5;

		if (diploma) {
			System.out.println("Congratilations");
			if (GPAscore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");

			}
		} else {
			System.out.println("Get a degree");
		}
		
		System.out.println("_________________________________________");
		/*Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. Once user decides to buy a house, 
		 * if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash.
		 */
		
		double morgRate, morgPrice;
		morgRate = 3;
		morgPrice = 12000;

		if (morgRate < 4.5) {
			System.out.println("I am thinking of byuing a house");

			if (morgPrice > 20000) {
				System.out.println("I need to get loan");

			} else {
				System.out.println("I am rich I can pay cash");
			}

		} else {
			System.out.println("I am not buying the house");

		}

	}
}