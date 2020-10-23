package Week4;

import java.util.Scanner;

public class RecapClassQuestion1 {

	public static void main(String[] args) {
	/*1- Calculate credit score (if else)
	 *  1- 299 Bad credit score
	 *  2- 300 - 579 very poor score --> %16
	 *   3- 380 - 669 fair credit score --> %18
	 * 4- 670 - 739 good credit score --> %21 
	 *   5- 740 - 799 very good score --> %25
	 *  6- 800 - 850 Excellent score --> %20 
	 *   Get score from user and print on the console
	 *   score and evaluation then score percentage
	 *  
	 */
		
	
	  
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter  cridit score");	
	int creditScore = input.nextInt();	
		
	if (creditScore<= 299) {
		System.out.println("Bad credit score");
		
	}else if (creditScore>=300 &&creditScore<=579){
	System.out.println("very poor score:" + "%16");
	
	}else if(creditScore>=580 &&creditScore<=669) {
		System.out.println("fair credit score :" +"%18");
		
	}else if (creditScore>=670 &&creditScore<=739){
	System.out.println("good credit score:" +"%21");
	
	}else if(creditScore>=740 &&creditScore<=799){
	System.out.println("very good score:"+"%25");
	
	}else if(creditScore>=800 &&creditScore<=850){
    System.out.println("Excellent score:" +"%20");
	}else {
		System.out.println(" you are genius");
	}
	}

}
