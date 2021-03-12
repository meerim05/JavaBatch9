package com.syntax.grouptask;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?
				int [] num1= {2,8,10,3};
				int length=num1.length;
				Arrays.sort(num1);
				System.out.println("Second highest number is "+num1[length-2]);
				
				

	}

}
