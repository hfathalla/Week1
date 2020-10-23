package Week1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	//	-Ask for height (Meter) 1.84
	//	-Ask for weight (KG)
	//	-Find BMI (bmi = weight/height*height

		Scanner scanner = new Scanner(System.in);
	System.out.println(" how many height meter : ");
	
	
	double height = scanner.nextDouble(); // nextLine taking string values
	System.out.println("how many weight  : "    );
	
double weight = scanner.nextDouble();
	
	double BMI = weight/(height*height);
	
	System.out.println("the BMI is  : " +BMI );
		
		
	}

}
