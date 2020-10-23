package Week4;

import java.util.Scanner;

public class Homework7Question1 {


//	1) Write a Java method to compute the average of three numbers.
	


public static void average() {
	
	Scanner num = new Scanner(System.in);
	System.out.print("Input the first number: ");
     double x = num.nextDouble();
    System.out.print("Input the second number: ");
     double y = num.nextDouble();
    System.out.print("Input the third number: ");
     double z = num.nextDouble();
    System.out.print("The average value is " +"\n" );
  
    System.out.println((x + y +x)/3);
	

	
}	
	
	
	public static void main(String[] args) {
		
		average();	

	}

}
