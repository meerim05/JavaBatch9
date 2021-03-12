package com.syntax.class12;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a="Winter";
		 String b="Summer";
		 System.out.println("Before swap:"+a+" "+b);
		 a=a+b;
		 b=a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		 System.out.println("After swap:"+a+" "+b);

	}

}
