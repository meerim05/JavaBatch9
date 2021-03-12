package com.syntax.class11;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] animals = {"Lion","Zebra","Monkey","Horse","Cow","Dog"};

for (int i=1; i<animals.length; i++) {
	System.out.println(animals[i]+" ");
}
   System.out.println();
   System.out.println("__________________________________________________");
   
   for(String anml_name:animals) {
	   System.out.println(anml_name+" ");
   }
	}

}
