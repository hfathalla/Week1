package Week1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*
		 Create one Profile, ask for name, ask for last name
		  - Ask for working hours, calculate the gross income with 42$ per hour
		  - Calculate Federal Tax = %10
		  - Subtract the tax, find net income.
		  - print profile, gross income and net income
		*/
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("What is your Name ? : ");
		String name = scanner.nextLine();
		
		System.out.println("What is your lastname ? : ");
		String lastname = scanner.nextLine();
		
		
		System.out.println("how many hours do you work ? : ");
		int houre = scanner.nextInt();
		int  hourRate = 42;
		int groseIncome  =  houre*hourRate;
		double FederalTax = groseIncome*(10/100 );
		double netIncome = groseIncome -FederalTax ;
		System.out.println("Name : " + name +"\n"+ "Name : " + lastname +"\n" +"Gross Income"+  groseIncome+"\n" +"Net Income"+ netIncome
				);
				
			
		
		
	}

}
