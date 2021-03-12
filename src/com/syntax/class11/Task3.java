package com.syntax.class11;

public class Task3 {

	public static void main(String[] args) {
		String[][] grocery= {
				{"potato","cabbage","beet","carrot"},
				{"apple","blueberry","grapes","mango"},
				{"cheeze","yogurt","milk","sour cream"},
				{"cake","candy","ice cream"}
		};
		for(int r=0; r<grocery.length;r++) {
			for(int c=0; c<grocery[r].length; c++) {
			
			System.out.print(grocery[r][c]+" ");
		}
			System.out.println();

	} 
		System.out.println("-----------------------");
		for(String[] list:grocery) {
			for(String name:list) {
				System.out.print(name+" ");
			}
			System.out.println();
		}

	}
}
/*
 * Using 2D array create a grocery list. Inside you should have an array of
 * veggies, fruits, dairy and sweets. Retrieve all values from that array using
 * 2 different loops
 */
