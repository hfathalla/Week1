package Week2;

import java.util.Scanner;

public class Homework4Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("what is the number of clases held");

int classHeld =scanner.nextInt();

System.out.println("what is the number of clases attended ");

int classAttended = scanner.nextInt();

double Attendes = ((classAttended/classHeld)*100);

if (Attendes<=75) {
	System.out.println("the student  is not allowed to sit in exam ");
}else{
System.out.println("the student  is  allowed to sit in exam");	
}



	}

}