package Week1;

import java.util.Scanner;

public class Question3 {
public static void main(String[] args) {
//	-Create an id like below
	//Input :         
	//        Lastname : Turk 
	//        Name : Ahmet Can    
	 //       Age:21
	  //      State:New Jersey
	 //       Place of Birth
	  //      License Number : 12345678910
	//Output : 
	 //       Lastname : Turk 
	  //      Name : Ahmet Can    
	   //     Age:21
	    //    State:New Jersey
	    //    Place of Birth
	      //  License Number : **
	
	
	
	
	
	
Scanner scanner = new Scanner(System.in);
	
	System.out.println("What is your last name ? : ");
	String lastname = scanner.nextLine(); // nextLine taking string values
	System.out.println("Lastname :  "+ lastname);
			
	System.out.println("What is your  name ? : ");
	String name = scanner.nextLine(); // nextLine taking string values
	System.out.println("Name  :  " + name  + " Fathalla");
					
			
			
	System.out.println("What is your  age ? : ");
	int age = scanner.nextInt(); // nextLine taking string values
	System.out.println("Age : " + age   );
			
					
	
	System.out.println("what is your state : ");
	String state = scanner.nextLine(); // nextLine taking string values
	System.out.println("State: " + state + "New Jersey");
	
	 
	
	System.out.println("What is your  place Of Birth ? : ");
	String placeOfBirth = scanner.nextLine(); // nextLine taking string values
	System.out.println("Place Of Birth : " +  placeOfBirth );
			
	

	System.out.println("What is your  licence Number ? : ");
	int MyLicenceNumber = scanner.nextInt(); // nextLine taking string values
	System.out.println("Licence Number : " +  MyLicenceNumber  );
/*	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("What is your lastname ? : ");
	String lastname = scanner.nextLine();
	
	System.out.println("What is your Name ? : ");
	String name = scanner.nextLine();
	
	System.out.println("What is your Age ? : ");
	String age = scanner.nextLine();
	
	System.out.println("What is your State ? : ");
	String state = scanner.nextLine();
	
	System.out.println("What is your POB ? : ");
	String main = scanner.nextLine();
	
	System.out.println("What is your license ? : ");
	String license = scanner.nextLine();
	
	System.out.println("Lastname : " + lastname +"\n"+ "Name : " + name
			+"\n" + "Age : " + age+"\n" +"State : " + state+"\n" +"POB:  : " + main
			+"\n" +"License Number : " +"***********");
	
	System.out.println("Name : " + name);
	System.out.println("Age : " + age);
	System.out.println("State : " + state);
	System.out.println("POB:  : " + main);
	System.out.println("License Number : " +"***********");
​	*/	
	
}
}
