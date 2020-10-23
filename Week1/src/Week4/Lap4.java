package Week4;

import java.util.Scanner;

public class Lap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Ask user for the array capacity(length)
	 * Create an array with that capacity
	 * Using a loop, let the user enter elements one by one
	 *  int[] nums = new int[count];
	 *  //using a loop enter values one by one
	 * for(int i=0; i < nums.length; i++) {
	 *  System.out.println("Enter number " + (i+1));
	 *  nums[i] = input.nextInt();
	 *  }
	 * Print all items in same line using for each loop
	 * 
	 * Print all items in same line using for loop
	 * 
	 * Print all items in same line using while loop
	 * 
	 */
		
Scanner scanner = new Scanner(System.in);
	System.out.println("What is the arry capacity");	
	int capacity =scanner.nextInt();
	int[]arr = new int[capacity];
	
	for (int i = 0; i < capacity; i++) {
	System.out.println("Enter Number: "+ (i+1));	
	arr[i] = scanner.nextInt();	
	}
	//forLoop
	for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);	
	}
	//for enhanced Loop
	for (int i:arr) {
	System.out.println(arr[i]);	
	}
	
	//while Loop
	int i =0;
	while (i<capacity) {
	System.out.println(i);	
	i++;	
	}
	
	
	
	}

}
