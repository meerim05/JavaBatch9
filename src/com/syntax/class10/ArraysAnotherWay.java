package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		String[] names={"Mike", "Burju", "Jack", "Danilo", "Bryan","Evgeniya"};
		
		System.out.println(names[3]);
		//how do I know how many elements I have in the array?
		
		int size=names.length;
		System.out.println("Size of names array = "+size);
		
		System.out.println(names[names.length-2]);
		
		int a=2;
		System.out.println(names[a]);//Jack
		
		a+=2;
		System.out.println(names[a]);//Bryan

		for(int i=0; i<names.length;i++){
			System.out.println(names[i]);
		}
		System.out.println("_________________________________________________");
		for(int i=0; i<=names.length-1;i++){
			System.out.println(names[i]);
	}
	}
}
