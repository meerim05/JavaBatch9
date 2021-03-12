package com.syntax.grouptask;

public class Task2 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type 
		 * where you will store odd and even numbers in 3 rows and 4 columns. 
		 * Develop a program which will identify/print the even numbers only. 
		 */
		
		int[][] numbers= {
				{2,3,4,9},
				{10,26,54,66},
				{15,12,33,84}
		};
       for(int i=0;i<numbers.length;i++) {
    	   for(int j=0;j<numbers[i].length;j++) {
    		   if(numbers[i][j]%2==0) {
    			   System.out.print(numbers[i][j]+" ");
    		   }
    	   }
       }
         System.out.println();
         System.out.println("____________________________________________");
         
         for(int[] nums:numbers) {
        	 for(int num:nums) {
        		 if(num%2==0) {
        			 System.out.print(num+" ");
        		 }
        	 }
         }
	}
}

