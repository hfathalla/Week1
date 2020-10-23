package Week1;

import java.util.Scanner;

public class Question6 {
public static void main(String[] args) {
	
//	- Create program to calculate and print area of a circle
//	  - User will provide radius of the circle. Formula of area of the circle : 3 * radius * radius
	
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("please inter the Radius of circle : ");
	
	double radious= scanner.nextDouble();
	
	
	double areaOfCircle =  3*radious*radious;
	
	System.out.println("The area of Circle:" +  areaOfCircle);
    }
}
