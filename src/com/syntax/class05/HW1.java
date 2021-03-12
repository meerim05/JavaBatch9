package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 decimal distinct number");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		double n3=scan.nextDouble();
		
		if (n1>=n2 && n1>=n3) {
			System.out.println("The largest number is "+n1);
		}else if (n2>=n1 && n2>=n3) {
			System.out.println("The largest number is "+n2);
		}else {
			System.out.println("The largest number is "+n3);
        
	}
	}
}
