package Week4;

import java.util.Scanner;

public class Homework7Quetion3 {

//	3) Write a Java method to display the middle character of a string.
//Note: a) If the length of the string is odd there will be two middle
//	characters.		
//	b) If the length of the string is even there will be one middle character.	
	public static void middle(String str) {
		
	     int position;
	        int length;
	        if (str.length() % 2 == 0) {
	        
	            position = str.length() / 2 - 1;
	            length = 2;
	        }else{
	       
	        
	            position = str.length() / 2;
	            length = 1;
	        }
	        System.out.println(str.substring(position, position + length));
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner any = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = any.nextLine();
        System.out.print("The middle character in the string: " + "\n");
        middle(str);
    
	}

}
	

		
	
	
	
