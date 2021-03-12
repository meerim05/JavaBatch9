package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Good Morning");
	}
	
	// I want t o print number 1 to 100
	for(int i=1; i<=100; i++) {
		System.out.println(i);
	}
	
	System.out.println("================numbers from 10 to 0================");
	
	for(int i=10; i>=0; i--) {
		System.out.println(i+" ");
	}
	System.out.println("==================What will be the output================");
	
	for(int i=0; i<=30; i+=3) {
		System.out.println(i+" ");
	}
}
}
