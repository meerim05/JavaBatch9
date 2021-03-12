package com.syntax.grouptask;

public class Task7 {

	public static void main(String[] args) {
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int count=10,num1=0,num2=1;
		System.out.println("Fibonacci series of "+count+" numbers:");
		
		for(int i=1;i<=count;++i) {
			System.out.print(num1+" ");
			
			int sumofPrevTwo=num1+num2;
			num1=num2;
			num2=sumofPrevTwo;
			
		}
		
	}

}
