package Week2;

import java.util.Scanner;

public class Question1 {
public static void main(String[] args) {
	
/*	
Create a calculator with if-else statements
Use scanner object to input numbers and operators from the user.
Operators will be char type. 
char operator = scanner.next().charAt(0);  This is how to get char type from user.

 * int c,d
 * char operator
 * if char =  + --> a +b
 * else if char = - --> a-b
 * else if char = * --> a*b
 * else if char = / --> a/b
*/		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("inter the first number");
	int a = scanner.nextInt();
	System.out.println("inter the second number");
	int b = scanner.nextInt();
	
	System.out.println("put your operator");
	char operator = scanner.next().charAt(0);
	
	
	
	if (operator == '+') {
	System.out.println("your answer is : " +(a+b));
	
	}else if(operator == '-') {
	System.out.println("your answer is : " + (a - b));	
		
	}else if (operator == '*'){
	System.out.println("your answer is : "+ (a*b));
	
	}else if (operator == '/'){
	System.out.println("your answer is : "+ (a/b));	
		
	}
	
	
	 	 
	 
  }	 
	 
}
