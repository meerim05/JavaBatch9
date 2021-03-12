package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		 //1 way to create a variable
		
		// create variable = assign value
		//declare  a variable=initializing
		double $num=12.99;
		
		//2 way to create a variable:
		  //declare a variable
		 //initialize or assuing value
		
		int myBox; //we declare variable only once
		myBox=135; //assign value
		System.out.println(myBox); //135
		
		myBox=115; //reassign value 
		System.out.println(myBox); //115

		// 3 way 
		
		int num1;
		int num2;
		int num3;
		// or int num1,num2,num3; if variable is of same type, we can declare all in one line
		
		num1=10;
		num2=20;
		num3=40;
		
		char char1='C';
		char char2='d';
		
		char char3=char1;
		System.out.println(char3); //C
	}

}
