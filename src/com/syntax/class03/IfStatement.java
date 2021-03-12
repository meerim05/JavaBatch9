package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1800;
		int num2=900;
		System.out.println("Writing my first  if statement");
   if(num1>num2) {	 
	 System.out.println("num1 is bigger than num2");
   }	
		System.out.println("End of if statement");
		
		System.out.println("---------------------------------");
		int temp=70;
	      if(temp>80) {
		    System.out.println("I am going to the beach");
	      }else {
	    	  System.out.println("I will go for a walk");
	      }
		System.out.println("----------------------------");
		
		double expectedHours=15;
		double actualHours=20;
		if (actualHours>expectedHours) {
			System.out.println("You will loved the course and will succeed");
		}else {System.out.println("Course will be hard fo you");
		}
	}
	}

