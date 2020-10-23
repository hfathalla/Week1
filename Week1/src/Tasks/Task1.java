package Tasks;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a java program to sort  a numeric array and a string array 
		
		
int numbers[] = {1,2,4,10,2,0};		
		
String names[] = {"Hend","Eslam","Selim","Mohanna"};

System.out.println("First numeric array:" +Arrays.toString(numbers));		
		
Arrays.sort(numbers);		
System.out.println("First numeric array:" +Arrays.toString(numbers));

System.out.println("First numeric array:" +Arrays.toString(names));

Arrays.sort(names);
System.out.println("First numeric array:" +Arrays.toString(names));


	}

}
