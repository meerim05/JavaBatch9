package com.syntax.class11;

public class TAsk1 {

	public static void main(String[] args) {
		
		String[][] $array=new String[2][4];
		
		$array[0][0]="Mr";
		$array[0][1]="Mrs";
		$array[0][2]="Ms";
		$array[0][3]="Miss";
		
		$array[1][0]="Obama";
		$array[1][1]="Smith";
		$array[1][2]="Jackson";
		$array[1][3]="Jordan";
		
		System.out.print($array[0][0]+" "+$array[1][0]);
		System.out.println();
		
		System.out.println("___________________________________________");
		String[][] cars= {
				{"Jeep","Ford","Dodge"},
				{"Audi","Porche","BMW"},
				{"Kia","Hyundai","Hyundai Sonata"},
				{"Ferrari","Maserati","Lamborgini"}
		};
		for(int i=0;i<cars.length;i++) {
			for(int j=0;j<cars[i].length;j++) {
				String car=cars[i][j];
				System.out.println(car+" ");
			}
			System.out.println();
		}
		       System.out.println("___________________________________________");                            
		
                 for(String[] carArray:cars) {
                	 for(String car:carArray) {
                		 System.out.println(car+"  ");
                	 }
                	 System.out.println();
                 }
	}

}
