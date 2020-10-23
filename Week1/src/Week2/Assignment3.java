package Week2;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//--------->1		
	//	Take values of length and breadth of a rectangle from 
	//	user and check if it is square or not
		
 String Mystring = new String ("name");
 
 String length = "4";
 String breadth = "5";
// System.out.println(length.equals(breadth));
 
 if(length==breadth) {
	System.out.println("it is square "); 
 }else {
System.out.println("it is a rectangle");	
}
 
//--------->2 
 
 //-Write a Java program to check whether 
 //two String objects contain the same data.
 
 String day1 = "cloudy";
 String day2 = "snowy";
 System.out.println(day1.equals(day2));
 
 
 //-------->3
 //Write a Java program to replace all the 'd' characters with 'f' characters.
 //Original string: The quick brown fox jumps over the lazy dog. 
 //New String: The quick brown fox jumps over the lazy fog.
 
 String message ="The quick brown fox jumps over the lazy dog";
 System.out.println(message.replace("d","f"));
 
	}

}
