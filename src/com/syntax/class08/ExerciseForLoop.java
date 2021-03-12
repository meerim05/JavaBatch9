package com.syntax.class08;

public class ExerciseForLoop {

	public static void main(String[] args) {
		int sumOdd=0;
		int sumEven=0;
		for(int n =1; n<51;n++) {
			if(n%2==0) {
				sumEven+=n;
			}else {
				sumOdd+=n;
			}
		}
		System.out.println("The sum of even number from 1 to 50 is "+sumEven);	
		System.out.println("The sum of odd number from 1 to 50 is "+sumOdd);	
		
		System.out.println("       Multiplication   table         ");
		
		/*
		 * 1*1=1
		 * 1*2=2
		 * 1*3=3
		 */
			int num1=7;
			int mult;
			for(int i=1;i<=10;i++) {
				mult=num1*i;
				System.out.println(num1+"x"+i+"="+mult);
			}
		}
	}


