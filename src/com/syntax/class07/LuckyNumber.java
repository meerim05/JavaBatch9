
	package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// play a lottery where we need to to enter number from 1 tp 100
		//lucky number is 7
		// keep asking a user enter a number until entered number is lucky number
		
		Scanner scan;
		int numberFromUser;
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		do {
		System.out.println("Please enter any number from 1 to 100");
		numberFromUser=scan.nextInt();
		}while(numberFromUser!=luckyNumber);
		System.out.println("You guessed number right");
	
	}
}