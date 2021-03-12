package com.syntax.class07;

public class Example {

	public static void main(String[] args) {
		String day="Saturday";
		
		if(day.equals("Saturday")) {
			System.out.println("My favorite Java Class");
		}
		System.out.println("------------------------------------------");
		boolean isItBreakTime=true;
		if(isItBreakTime) {
			System.out.println("I will get tea");
		}
		while (isItBreakTime) {
			System.out.println("I will get tea");//infinite
			isItBreakTime=false;
		}
	}
	}

