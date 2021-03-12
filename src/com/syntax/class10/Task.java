package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		char[] grades = new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		
		System.out.println("_________ANOTHER WAY____________");
		char[] grades2= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		System.out.println();
		String[] names = new String[5];
		names[0]="Melaku";
		names[1]="Meddy";
		names[2]="Miquel";
		names[3]="Mike";
		names[4]="Meerim";
		System.out.println(names[4]);
		
		System.out.println("________________2WAY________________");
		String[] names2= {"Melaku","Meddy","Miquel","Mike","Meerim"};
		System.out.println(names[4]);
		
		System.out.println();
		
		String[] words= {"Java","Saturday","day","coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]+".");
	}

}
