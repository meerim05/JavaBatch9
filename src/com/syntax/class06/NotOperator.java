package com.syntax.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		boolean isEasyJava=false;
		System.out.println(!isEasyJava);
		
		System.out.println("Please try spent more time with Java");
		
        System.out.println("-------------------------------------");
        String day="Monday";
        
        if(!(day.equals("Sunday")|| day.equals("Saturday"))) {
        	System.out.println("I am going to work");
	}
	}
}
