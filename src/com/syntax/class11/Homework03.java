package com.syntax.class11;

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create an array of countries.
 * While retrieving all values from an array print capital for each country. 
 */
		String[] countries= {"Russia","USA","England"};
		String[] capitals= {"Moscow","DC","London"};
		String capital;
		for(String country:countries) {
			switch(country) {
			case "Russia":
				capital="Moscow";
				break;
			case "USA":
				capital="DC";
				break;
			case "England":
				capital="London";
				break;
		    default:
		    	capital="I do not know";
			}
			System.out.println("Capital of the "+country+" is "+capital);
			}
		}
	}


