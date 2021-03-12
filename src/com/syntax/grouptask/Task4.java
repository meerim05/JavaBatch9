package com.syntax.grouptask;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries have been stored.
		 */
		String[][] countries = { { "USA", "Canada", "Mexico", "Panama" }, { "Brazil", "Argentina", "Peru", },
				{ "Spain", "Russia", "France", "Sweden" }, { "Singopore", "China", "Thailand", "Japan" },
				{ "Morocco", "Nigeria", "Mali" } };
		int total = 0;
		for (int i = 0; i < countries.length; i++) {
			total = total + countries[i].length;
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + ".");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total number of countries " + total);

		System.out.println();

		System.out.println("_______________________________________________");
		int sum=0;

		for (int i = 0; i < countries.length; i++) {

			sum = sum + countries[i].length;
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + ". ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Total number of countries " + sum);
	}

}
