package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Question 1) Create one String Array and one Numeric Array with 5 elements each.  

 * Write a Java program to sort a numeric array and a string array.
 
 */
		
		  int [] Arry1 = {14,66,55,12,23,47,78}; 
		     System.out.println(Arrays.toString(Arry1));
		     Arrays.sort(Arry1);
		    System.out.println(Arrays.toString(Arry1)); 
		 
		    String Arry2[]= {"Hend","Eslam","Selim","Mohanna"};  
		     System.out.println(Arrays.toString(Arry2));
		     Arrays.sort(Arry2);
		     System.out.println(Arrays.toString(Arry2));
		    
	/*Question 2) Write a Java program that keeps a number from the user 

	 * and generates an integer between 1 and 7 and displays the name of the weekday.
	 * Use Switch Case.
	 * 	     
	 */
		     
		     Scanner scanner = new Scanner(System.in);
	        System.out.println("What is the number of the  day : ");
	        String key = scanner.nextLine();
	             
	        
	        switch (key) {
	        
	        case "1": 
				System.out.println("This is monday");	
				break;	
					
				case "2": 
				System.out.println("This is Tuesday");	
				break;		
					
				case"3": 
				System.out.println("This is Wednsday");	
				break;
				
				case"4": 
					System.out.println("This is Thursday");	
					break;
				
				case"5": 
					System.out.println("This is Friday");	
					break;
					
				case"6": 
					System.out.println("This is Satarday");	
					break;
					
				case"7": 
					System.out.println("This is Sunday");	
					break;
					
				default:
					System.out.println("This is not the first days of the week");
					
	        }	
			
	}

}
				
			
			
	


			
			
		     
	             
		
	


