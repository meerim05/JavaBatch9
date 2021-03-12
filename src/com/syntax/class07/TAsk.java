package com.syntax.class07;

public class TAsk {

	public static void main(String[] args) {
	
		int e=99;
		while(e>0) {
			System.out.println(e+" ");
			e-=2;
		}
		System.out.println("Another way");
		int f=100;
		while(f>0) {
		if((f%2) !=0) {
			System.out.println(f+" ");
		}	
		f--;
		
	}
		System.out.println("Print even numbers from 20 to 1 (2 ways)");
		
		for(int i=0;i<=20;i+=2) {
			System.out.println(i+" ");
		}
			
	}
}
