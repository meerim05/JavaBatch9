package com.syntax.class07;

public class TAsk02 {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		
		while(day<=6) {
			System.out.println("I need a day off");
			day++;
			if (day>6) {
				System.out.println("I do not need a day off any more");
			}
			System.out.println("=====Another Way=====");
			while(workDay) {
				if(day<6) {
					System.out.println("I need a day off");
				}else {
					System.out.println("it is weekend and I am off");
					workDay=false;
				}
				day++;
			}

	}

}
}
