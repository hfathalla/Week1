package Week4;

import java.util.Scanner;

public class Homework7Question2 {

//	2) Write a Java method to find the smallest number among three numbers.	
public static int smallest (int x,int y,int z) {
return	Math.min(Math.min(x, y),z) ;

}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	Scanner	num =new Scanner(System.in);
	System.out.println("Input the first number:");	
	int x =num.nextInt();	
	
	System.out.println("Input the second number:");	
	int y =num.nextInt();
	
	System.out.println("Input the third number:");	
	int z =num.nextInt();	
	
	System.out.println("the smallest value is: " + smallest(x,y,x)+"\n");
	}

}
