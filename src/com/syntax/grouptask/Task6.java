package com.syntax.grouptask;

public class Task6 {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		
		int num=100;
		boolean isPrime=false;
		for(int i=2; i<=num/2; ++i) {

			if(num%i==0) {
				isPrime=true;
				break;
			}
			}
		if(!isPrime) {
			System.out.println(num+" is prime number.");
		}else {
			System.out.println(num+" is not a prime number.");
		}
			
	}

}
