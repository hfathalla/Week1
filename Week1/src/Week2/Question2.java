package Week2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		Calculate the cost of toll.

		Ask the user for how many miles you make. And calculate the price.

		NORMAL HOURS, toll prices are 
		0 mile - 100 mile  -> $5 
		101 mile - 500 mile  -> $8 
		501 mile - 1000 mile -> $10 
		More than 1000 mile -> $12

		RUSH HOURS: 0 mile - 100 mile  -> $10 
		101 mile  - 500 mile  -> $17 
		501 mile  - 1000 mile  -> $20 
		More than 1000 mile-> $24

				 if (normal hours){
				 if (0-100){...}
				 else if (100-500){...}
				 else {...}
				 }
				 else {
				 if (0-100 ){...}
				 else if (100-500){...}
				 else {...} 
				  }}	
			

		*/	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Is it rush hour " );
			String answer = scanner.nextLine();
			boolean rushHours = answer.equalsIgnoreCase("yes"); 

			
			System.out.println("inter your maile ");
			int mile  = scanner.nextInt();	
			
			if (mile>=0 &&mile <= 100 ) {
				if (rushHours) {
					System.out.println("Your cost is : " + 5);
				}
				else {
					System.out.println("Your cost is : " + 8);
				}
			
			 if (mile>=101 &&mile <= 500) {
				 if (rushHours) {
					 System.out.println("Your cost is : " + 10); 
				 }else {
					 System.out.println("Your cost is : " +15 );	 
				 }
			 }
					
			 if (mile>=501 &&mile <= 1000) {
				 if (rushHours) { 
					 System.out.println("Your cost is : " + 20);	 
				 }else {
					 System.out.println("Your cost is : " + 40); 
				 }
			 
					
			 if (mile>=1000) {
				 if (rushHours) { 
					 System.out.println("Your cost is : " +50); 	 
				 }else {
					 System.out.println("Your cost is : " + 60); 	 
				 
				 }
						
			}

			 
			 }
			 
			}
			 
	}

}
