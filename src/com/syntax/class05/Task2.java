package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your heights in inches");
		 int heights=scan.nextInt();
		 if(heights>50 && heights<=60){
		  System.out.println("Short");
		 }else if (heights>=60 && heights<72){
		 System.out.println("Medium");
		 } else if( heights>72) {
			 System.out.println("Tall");
		 }
		 
		 System.out.println("-------------------------------------------------------");
		 
		 
	}
	}


