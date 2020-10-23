package Week1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Get two numbers from the user
				// Switch the variables. 
				// a = 15, b = 20 b = 15, a = 20	
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("please inter two number : ");
		int num1 = scanner.nextInt(); // nextLine taking string values
		int num2 = scanner.nextInt();
int x = num1;


	num1 =num2;

	num2 = x;
System.out.println(num1);
System.out.println(num2);
	}

}
