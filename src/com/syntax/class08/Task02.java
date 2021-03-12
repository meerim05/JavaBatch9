package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number from start and end");
		int num1=scan.nextInt();
        int num2=scan.nextInt();
        int sumEven=0;
        int sumOdd=0;
        
        for(int i=num1;i<=num2;i++) {
        	if(i%2==0) {
        		sumEven+=i;
        	}else {
        		sumOdd+=i;
        	}System.out.println("The sum of even number "+sumEven);
        	System.out.println("The sum of odd number "+sumOdd);
        }
        	
        
	}

}
