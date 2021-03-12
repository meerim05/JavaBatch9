package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan;
		String answer;
		int years;
		double salary;
		scan=new Scanner(System.in);
		System.out.println("Please enter numbers of worked years ");
		years=scan.nextInt();
	
		if(years>=5) {
			System.out.println("You are eligible for bonus");
			System.out.println("Please enter your annual salary");
			salary=scan.nextDouble();
			if(salary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("You are not eligible");
		}
		
		

	}
	}

