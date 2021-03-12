package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array on double values using scanner calculate the sum of all
		 * stpred elements in that array
		 */
		double sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements you want to store");
		int size = scan.nextInt();
		double[] a = new double[size];

		for (int i = 0; i < size; i++) {
			a[i] = scan.nextDouble();
			sum += a[i];
		}

		System.out.println("The sum of " + size + " elements from an array =" + sum);
		
		System.out.println("Calculatint sum using for each loop");
		sum = 0;
		for (double num : a) {
			sum += num;
		}
		System.out.println("The sum of " + size + " elements from an array =" + sum);
	}

}
