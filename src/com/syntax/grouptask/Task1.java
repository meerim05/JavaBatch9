package com.syntax.grouptask;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */

		int[][] array = { { 33, 98, 75 }, { 10, 56, 80 }, { 17, 39, 65 } };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				sum += array[i][j];
			}
		}

		System.out.println(sum);

	}

}
