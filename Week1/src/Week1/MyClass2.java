package Week1;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		
		  //Boolean logic : or   ---and 
		  
		  // || or if one of the left side or right side is true then it is going be true 
		  //&& if left side and right side is true then it is going be true
		  
		
		
	System.out.println(true &&true);	
	System.out.println(true &&false);
	boolean userName = true;
	boolean password = false;
	
	System.out.println(userName&&password);
	  
	//in order to get scholarship
	//you need to have +3.0 or your income should be lower than $50,000, you need to live in nj 
	
	
	System.out.println(true || true);
	System.out.println(true ||false);
	System.out.println(false ||false);
	System.out.println("Or Operator :"+ (true||true) );
	
	System.out.println("Or Operator :"+ (true&&(false||9<0||9>8)) );
	
	
	//Narrowing casting
	double GPA = 3.8;
	int GPA1 = (int)GPA;
	System.out.println(GPA1);
	  
	//widening casting
	 int myInt = 90;
	 double myDouble = myInt;
	 System.out.println(myDouble);
	 System.out.println(myInt);
	 
	 int num1 =4;
	 int num2 = 5;
	System.out.println((double)num1/num2); 
	
	int sum1 = num1 +num2;
	System.out.println(sum1/2);
	
	//finding the average 
	double sum = num1+num2;
	System.out.println(sum/2);
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("What is your first name ? : ");
	String input = scanner.nextLine(); // nextLine taking string values
	System.out.println("My name is : " + input +  " Fathalla");
			
			
			
	System.out.println("What is your  age ? : ");
	int input2 = scanner.nextInt(); // nextLine taking string values
	System.out.println("My age is : " + input2   );
			
					
	
	System.out.println("What is your  GPA ? : ");
	double input3 = scanner.nextDouble(); // nextLine taking string values
	System.out.println("My GPA is : " + input3   );
			
	// ask  user for year of birth and calculate the age 
	//age = 2020 - yearofBirth
	 
	
	System.out.println("What is your  date Of Birth ? : ");
	int input4 = scanner.nextInt(); // nextLine taking string values
	System.out.println("My age is : " + (2020-input4)   );
			
	
	// ask for two numbers from the user , find the division of those two number 
	
	
	System.out.println("What is first number? : ");
	int firstNumber = scanner.nextInt(); // nextLine taking string values
	
	System.out.println("What is second number ? : ");
	int secondNumber = scanner.nextInt();
	System.out.println("the division of two number: " + (firstNumber/secondNumber)   );
	}

}
