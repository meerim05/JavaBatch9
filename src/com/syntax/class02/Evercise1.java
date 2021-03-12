package com.syntax.class02;

public class Evercise1 {

	public static void main(String[] args) {
		
		double n1 = 40.25;
		double n2 = 120.50;

		double sum = n1 + n2;
		double min = n2 - n1;
		double mult = n1 * n2;
		double div = n2 / n1;
		System.out.println("The result of " + n1 + "+" + n2 + "=" + sum);
		System.out.println("The result of " + n2 + "-" + n1 + "=" + min);
		System.out.println("The result of " + n1 + "*" + n2 + "=" + mult);
		System.out.println("The result of " + n2 + "/" + n1 + "=" + div);

		System.out.println("______________________________");
		double num1 = 3.9;
		double square = num1 * num1;
		System.out.println("The square of the " + num1 + " is " + square);

		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = (width + height) + (width + height);
		System.out.println("The perimeter of a rectangle with " + width + " and " + height + " is equal to " + perimeter
				+ " and the area is " + area);
	}

}
