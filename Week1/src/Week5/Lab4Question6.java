package Week5;

public class Lab4Question6 {
/*
6. Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. 
*/
public static boolean Even(int number ) {
	
	if(number %2==0) {
    
       return true;
        
       
    } else {
   
    	 return    false;
       
    	 
    } 	
	
}	


	public static void main(String[] args) {
		System.out.println(Even(9));
		if(Even (46)) {
        
            System.out.println("Number is even");
            
        }else {
       
        
            System.out.println("Number is odd");
        }   	
	}

}
