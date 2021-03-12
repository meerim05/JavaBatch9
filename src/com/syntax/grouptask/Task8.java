package com.syntax.grouptask;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		
		// Max and Min number in the array?
		
		int[] myArray= {70,65,53,200,78,600};
		
		int max=myArray[0];
		int min=myArray[0];
		
		
		for(int i=1;i<myArray.length;i++) {
			if(myArray[i]>max) {
				max=myArray[i];
			}if(myArray[i]<min) {
				min=myArray[i];
			}
		}
		
		System.out.println("The largest number is "+max);
		System.out.println("The smallest number is "+min);
		
	
	}

}
