package com.syntax.class11;

public class Creating2DArray {

	public static void main(String[] args) {
		// creat 2D array of food
		// american
		//italian
		//asian
		//afgani
		//indian
		
		String [][] food= {
				{"steak","hot dog","cheeseburger"},
				{"pizza","pasta","canoli"},
				{"sushi","ramen","fried rice","dumplings"},
				{"kebab","manto"},
				{"beriyani","masal","curry","Chicken tikka"}
		};// enhanced loop
		for (String[] dishes:food) {
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
			System.out.println();
		}
		System.out.println("_______________________________________________");
         for(int i=0;i<food.length;i++) {
        	 for(int j=0;j<food[i].length;j++) {
        		 System.out.print(food[i][j]+" ");
        	 }
        	 System.out.println();
         }
	}

}
