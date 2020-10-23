package Week5;

public class NestedForLoop1 {

	public static void main(String[] args) {
		
	//nested 	
	//for loop inside the another for loop	
	//	for (int -1 condition increment){
	// for(	int j=0  condition increment){
		
		
		
	//	dimensional
	/* 1
	 * 1  2 
	 * 1   2  3
	 * 1   2  3   4
	 * 1   2   3   4  5  6  7  8  9  10	
	 */
	for (int j = 1; j <=10 ; j++) {
	for (int i = 1; j <=i; i++) {
		System.out.print(i +" ");
	}
	System.out.println();
	}	
	System.out.println("outside");	
	}

}
