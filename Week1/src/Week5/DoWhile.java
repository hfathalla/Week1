package Week5;

import java.util.Scanner;


public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	ask for 5 dollers 
		//and keep asking for 5 doolers until you get it 
		//or user enters it
		
	Scanner	 inputScanner = new Scanner(System.in);
		
	int  amount ;
	
	do {
		System.out.println("Give me 5 dollers");
		amount = inputScanner.nextInt();
	} while (amount !=5);	
	System.out.println("Thank you bro.....");	
		
	}

}
