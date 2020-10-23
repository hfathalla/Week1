package Week2;

import java.util.Scanner;

public class Homework4Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Marks");	

int grade =scanner.nextInt();
if (grade <= 25) {
	System.out.println("The Marks grade is:" + 'F');
	
}else if (grade <=45&&grade<50){
System.out.println("The Marks grade is:" + 'E');

}else if (grade <=50&&grade<60) {
System.out.println("The Marks grade is:" + 'D');

}else if (grade <=60&&grade<80) {
	System.out.println("The Marks grade is:" + 'C');
	
}else if (grade>= 80) {
System.out.println("The Marks grade is:" + 'B');	

}else  {
System.out.println("The Marks grade is:" + 'A');	
}















	}

}
