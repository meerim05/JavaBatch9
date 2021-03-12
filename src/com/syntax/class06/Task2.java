package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter grade");
		 char grade=scan.next().charAt(0);
		  String message;
		  
		  switch(grade){
		  case 'A':
		  message ="Excellent";
		  break;
		  case 'B':
		  message="Good";
		  break;
		  case 'C':
			message="Average"; 
			break;
		  case 'D':
			  message="Bad";
			  break;
			  default:
				 message=" Not acceptable";
		  }
System.out.println(message);
	}
}
