package Week4;

import java.util.Scanner;

public class RecapClassQ3 {

	public static void main(String[] args) {
	
	/*3- Password checker (if else --> hint: nested)
	 *  Create a login system and check exact 
	 * password and username
	 *  Variables:
	 *   String secretUserName = "admin1";
	 *   String secretPassword = "ab1c123";
	 * > Make sure that they match with secret ones
	 * and allows login successfully
	 *  > Whenever login is not successful, let
	 * program tell exact reason
	 *    > Why it is not valid
 
	 *  --> username is not valid
	 * 	 --> password is not valid
	 * --> both username and password are invalid
	 */
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your username: ");
	String name =input.nextLine();
	
	System.out.println("Enter your password: ");
	String password  = input.nextLine();
	
		String secretUserName = "admin1";	
		 String secretPassword = "ab1c123";
		
	if (secretUserName.equals(name)) {
		if(secretPassword.equals(password)) {
			System.out.println("both username and password are successfuly");
		}else {
			System.out.println("username is not valid");
		}
		
		}else {
		System.out.println(" password is not valid");	
		
	}
		
	
		if  (!secretUserName.equals(name)&&secretPassword.equals(password)) {
			System.out.println("both username and password are invalid ");
		}else {
		System.out.println("username is not valid");	
		}
		
		
		
		

	}

}
