package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean morning = true;
		boolean classToday = false;
		
		//is it morning?--> Good morning
		// if there is class: yes-->hello classmates
		//          otherwise-->hello my family
		
		if(morning) {
			System.out.println("Let me check if I have class today");
			
			if(classToday) {
				System.out.println("Good morning my classmates");
			}else {
				System.out.println("Good morning my family");
			}
		}

		
	}

}
