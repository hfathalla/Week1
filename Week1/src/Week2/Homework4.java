package Week2;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	Scanner	scanner = new Scanner(System.in);
		
    System.out.println("what is the quantity");

	int unit = scanner.nextInt();
	
	int cost = unit*100;
	if (cost>=1000) {
		double cost1 = cost -(cost*10/100);
		System.out.println("the total  of cost is : $" +cost1);
	}else {
	System.out.println("the total of cost is : $"+ cost);	
	}
	
	
	}
}