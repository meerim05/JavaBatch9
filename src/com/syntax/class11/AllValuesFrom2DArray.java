package com.syntax.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		String[][] usa = { 
				{ "Alexandria", "Oakton", "Arlington", "Fairfax" }, 
				{ "Philly", "Strassburg", "Pittsburg" },
				{ "Boston", "Quincy", "Springfild", "Burlington" },
				{ "Los Angeles", "Long BEach", "San Francisco", "Sacramento", "Santa Barbara" },
				{ "Miami", "Orlando", "Tampa", "Tallahase" } 
				};
		System.out.println(usa.length); //5
		System.out.println(usa[0].length);//5
		System.out.println(usa[1].length);//3
		
		for(int r=0; r<usa.length; r++) {// iterator over rows
			
			for(int c=0;c<usa[r].length;c++) {
				System.out.print(usa[r][c]+"  ");
			}
			System.out.println();
		}
		System.out.println("----Using nested for each loop-----");
		
		for(String[] cities:usa) {
			for(String city:cities) {
				System.out.print(city+" ");
			}
			System.out.println();
		}
	}

}
