package Week2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program called CheckClass : 

		//	We have weekdays which are assigned to numbers from 1 to 5.
		//	We need to use Scanner class to ask for the number of a day to user.
		//	Our program will determine which day is assigned with given number and what class we have tha

		Scanner scanner = new Scanner(System.in);
		System.out.println(" what the number of a  day  " );
	
		int   day  = scanner.nextInt();
		String ClassAtSchool = "";
		String weekDay ="";
		
		if(day == 1) {
			weekDay = "Monday";
			ClassAtSchool = "Java";
			
		}else if (day ==2) {
			weekDay = "Tuesday";
			ClassAtSchool = "Python";
				
		}else if (day ==3) {
			weekDay = "Wednesday";
			ClassAtSchool = "C++";
		}else if (day ==4) {
			weekDay = "Thursday";
			ClassAtSchool = "Selenium";
		}else if (day ==5) {
			weekDay = "Friday";
			ClassAtSchool = "HTML";
		}else if (day ==65) {
			weekDay = "sunday";
			ClassAtSchool = "Holiday";	
		}
		System.out.println("Day of the week: 3"
				+ " " + weekDay + "\n"+ "Class at school; " + ClassAtSchool);
	}

}
