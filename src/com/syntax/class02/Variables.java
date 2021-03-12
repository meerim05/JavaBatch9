package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
     String name="Kate";
     String LastName = "Duker";
     char grade='A';
     String city ="Brooklyn";
     String state="NY";
     long phoneNumber=9879789798L;
      
      System.out.println("My name is "+name+" and my last name is "+LastName);		
      System.out.println("I am "+grade+" student");		
      System.out.println("I live in "+city+" and state is "+state);		
      System.out.println("And my phone number is "+phoneNumber);		
      
      
      city="LA";
      state ="California";
      phoneNumber=5745466487l;
      grade='B';
      System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state);
      System.out.println("My new phone number is "+phoneNumber);
	}

}
