package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=90;
		num=num+1;
		num+=1;
		System.out.println(num);
		num++; //adding 1
		System.out.println(num);
		 int num1=100;
		 num1-=1;
		 num1--;//subtract 1
		 System.out.println(num1);
		 //100--;CError
		 // increment & decrement operators can be used ONLY with variables
				
   System.out.println("===========================================================");
   
   int time =15;
  // if (time>12) {// condition is true
	   //System.out.println("Good day");//code executes 1 time
   
   while (time>12) {
	   System.out.println("Good day");//INFIFNITE LOOP
	   time--;//14--; 13--; 12;
   }
  // while (time>12) {
	//   System.out.println("Good day");//INFIFNITE LOOP
	  // time++;//16,17,18.....
   
       // I want to print numbers from 1 to 50
   int num2=1;
   while(num2<=50) {
	   System.out.println(num2);
	   num2++;//1,2...49,
   
	}
   System.out.println( "From 10 to 60");
   int a=10;
   while(a<=60) {
	   System.out.print(a+" ");
	   a++;
   }
   System.out.println("From 100 to 60");
   int b=100;
   while(b>=60);
   System.out.print(b+" ");
   b--;
	}
	
	//System.out.println(" from 10 to 30 only even numbers");
	//int c=10;
	//while(c<31) {
		//if(c%2==0) {
			//System.out.println(c+" ");
		//}
		//c++;
	//System.out.println();
	//int d=10;
	//while(d<=30){
		//d+=2;
	//}			
} 

