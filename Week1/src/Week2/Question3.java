package Week2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a program to check whether triangle is equilateral, scalene or isosceles
		//Equilateral triangle : all three sides are equal.
		//Isosceles Triangle :  with two equal sides.
		//Scalene triangle:  three sides have different lengths

		

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("the triangle is " );
//		
//		int triangle  = scanner.nextInt();
//
//		
	int side1=4;
	int side2=4;
	int side3=4;
		if (side1==side2 && side2==side3&&side1==side3) {
		System.out.println("Equilateral triangle");	
		}else if(side1==side2&&side2!=side3) {
		System.out.println("Isosceles Triangle");
		
		}else if (side1!=side2&&side2!=side3&&side1 !=side3) {
			System.out.println("Scalene triangle");
		}
		
	}

}
