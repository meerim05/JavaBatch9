package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String name="Olga";
		// I would like to say : My name is Olga
		 System.out.println("My name is" +name); 
		 
		 String lastName="Sorrels";
		 // lastname + firstname
		 
		 System.out.println(name+" "+lastName);
		
		 String city= "Miami";
		 //Olga lives in Miami
		 System.out.println(name+" lives in "+city);
		 
		 char grade ='B';
        //Olga is B student
		 System.out.println(name+" is "+grade+" student");
		 
		 int age =21;
		 //Olga is 21 years old
		 System.out.println(name+" is "+age+" years old ");
		 //to attach/concatenate ANY value(char,int, String,double to a String we use + 
		 
		 int date=27;
		 String month = "September";
		 System.out.println(date+" "+month);
				 
	}

}
