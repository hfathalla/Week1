package Week1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
	//	Question 1
	 //    Ask user : 
	  // - How much ($) fuel does your car burn in one km ? (Example : 0.32) cost_per_km
	  // - How many km did you drive ? (Example :50 km) 
	  // - Calculate the cost
	  // - Formula : cost_per_km * km	
		
		
		
	
 

		Scanner scanner = new Scanner(System.in);
	System.out.println(" Hom much Fuel does the car burn on one km? : ");
	
	
	double Fuel = scanner.nextDouble(); // nextLine taking string values
	System.out.println("how many km did you drive : "    );
	
	
	
	double km = scanner.nextDouble();
	
	double totalCost = Fuel * km;
	
	System.out.println("Your total cost is : " + totalCost);
		
	}

}
