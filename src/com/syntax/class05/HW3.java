package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
     Scanner scan;
	 double sales,commission;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter sales amount");
      sales=scan.nextDouble();
      if(sales>10 && sales<100) {
    	  commission=(sales*10)/100;
	}else if(sales>100 && sales<200) {
		  commission=(sales*20)/100;
	}else if (sales>200 && sales<500) {
		commission=(sales*30)/100;
	}else if (sales>=500 ) {
		commission=(sales*50)/100;
}else {
	commission=0;}
	System.out.println("Your commission is "+commission);
}
}
