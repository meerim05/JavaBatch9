package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct number");
         int num1=scan.nextInt();
         int num2=scan.nextInt();
         int num3=scan.nextInt();
         int largeNum;
         
         if (num1>num2) {
        	 if(num1>num3) {
        		 largeNum=num1;
        	 }else {
        		 largeNum=num3;}
        	 }else {
        		 if(num2>num3) {
        			 largeNum=num2;
        		 }else {
        			 largeNum=num3;
        	 } System.out.println("The largest number is "+largeNum);
         }
	}

}
