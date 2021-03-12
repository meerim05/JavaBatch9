package com.syntax.class07;

import java.util.Scanner;

public class LoopIntro {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		System.out.println("-------------------------------------");
		
		int time =7;
		
		if(time<12) {
			System.out.println("hello");
		}
		
		System.out.println("  WHILE LOOOP");
		
		while(time<12) {
			System.out.println("hello"); // runs forever
			time++;
		}
		
		System.out.println(" PRINT NUMBERS FROM 1 TO 10");
		
		int num=1;
		
		while(num<11) {
			System.out.println(num);
			num++;
		}

		System.out.println("-------------------------------------------");
		/*
		 * I want to capture  5 different names 5 times and say hello to you
		 */
		//Scanner scan;
		String name;
		
		Scanner scan=new Scanner(System.in);
		
		int q=5;
		
		while(q>=1) {
			
		System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("Hello "+name);
		q--;
	}
		
	}
}
