package com.syntax.class04;

public class NestedIfExamples {

	public static void main(String[] args) {
		/*
		 * if it is Friday --> go to the movie, otherwise stay at home and study
		 * if it is Friday then I will check  if day is 13 -->if yes -->watch scary movie
		 *         if no -->watch any movie you like
		 */
		boolean isFriday=true;
		int day =13;
		
		if(isFriday) {
			System.out.println("It is movie day!!!");
			
			if(day==13) {
				System.out.println("I will watch scary movie");
			}
			else {
				System.out.println("I watch any available movie");
			}
		}
		else {
			System.out.println("I will stay home and study Java");
		}
		
		

	}

}
