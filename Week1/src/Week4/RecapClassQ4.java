package Week4;

import java.util.Scanner;

public class RecapClassQ4 {

	public static void main(String[] args) {
		
/*4- Create a program and find 
 * which month is how many days. (switch&case)
 *   Example if user enter 5 (May) print on the 
 * console:
 *  number of days 31
 * 
 */
Scanner scanner =  new Scanner(System.in);		
System.out.println("Enter the number of  month");		
		
int month = scanner.nextInt();		
		
switch (month) {
case 1: 
case 3:	
case 5:
case 7:
case 9:
case 11:	
	
System.out.println("number of days 31");	
break;
case 2:
case 4:
case 6:
case 8:
case 12	:
System.out.println("number of days 30 ||28||29");	
break;
default:
	System.out.println("number of the month is 0");
	break;
}		
		
		
		
		
	}

}
