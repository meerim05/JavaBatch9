package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		/*
		 * Print even numbers from 20 to 1 (2 ways)
           Print odd numbers between 20 and 50 (2 ways)
		 */
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}System.out.println("      ");
		System.out.println("--------Task 2-----------------");
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
	}System.out.println("  ");
		System.out.println("-------------Task 3--------------");
		for(int i=20; i>=1; i--)
			if(i%2==0) {
				System.out.print(i+" ");
			}System.out.println("   ");
		System.out.println("-----------------Task4-------------");
		for(int i=20;i<=50;i++)
			if(i%2!=0) {
				System.out.print(i+" ");
			}System.out.println("-----------------------------------");
		int sum=0;
		for(int i=1;i<5;i++) {
			sum=sum+i;
		}System.out.println(sum);
	}
	
}
