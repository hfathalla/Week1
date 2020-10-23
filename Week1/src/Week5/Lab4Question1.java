package Week5;

public class Lab4Question1 {
	//1. This java method is printing only the first element of the array. Change this method to a Java 
	//program that loops through the array below and prints all the elements inside of the array. 
			
	
public static void arrayPrinter(int []arrayParameter) {
for (int i = 0; i < arrayParameter.length; i++) {
	

		System.out.println(arrayParameter[i]);
		
}	
	
}	
	
	
	public static void main(String[] args) {
		
			//int [] arrayArgument = {9,8,7,6,5,4,3};
int []arrayParameter ={9,8,7,6,5,4,3};
			arrayPrinter(arrayParameter);
		
			
			
		
	}

}
