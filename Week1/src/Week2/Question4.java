package Week2;

import java.util.Scanner;





public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Finding the oldest age in three age.
	//	Ask user to input 3 integer (age1, age2, age3 )
	//	Find which one is the oldest one.
int  YoungestPerson , PersonOneAge ,PersonTwoAge ,  PersonTreeAge;
	 
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter person one Age ");
	
	PersonOneAge = keyboard.nextInt();
	System.out.println("Enter person two age ");
	
	PersonTwoAge = keyboard.nextInt();
	
	System.out.println("Enter person three age ");
	
	PersonTreeAge = keyboard.nextInt();
	
 
	
if( (PersonOneAge<PersonTwoAge) && (PersonOneAge<PersonTreeAge)){
	
	System.out.println("Person One is the Youngest person");
	
}else if( (PersonTwoAge<PersonOneAge)&&(PersonTwoAge<PersonTreeAge)){
	
System.out.println("person Two is the Youngest person" );

}else {
System.out.println("person Three is the youngest person");	
}
	
	
	
	
	
	}

}
