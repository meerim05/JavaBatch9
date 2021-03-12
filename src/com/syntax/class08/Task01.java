package com.syntax.class08;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++) {
			if(i%3==0){
				continue;
			}
			{
				System.out.println(i+" ");
			}
			System.out.println("__________________task 2_________________________");
			System.out.println("Please apply for a credit card");
			
			Scanner scan=new Scanner(System.in);
			String response;
			do {
				System.out.print("Do you want to apply for credit card");
				response=scan.nextLine();
				
			}while(!response.equalsIgnoreCase("yes"));
			System.out.println("You are selected");
		}
	}

}
