package Week5;

public class preForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Reverse String --- reverse array reverse number
		
	String word = "selimHend"	;
	//dnehmiles
	String reversed = "";
	
	for (int i = word.length()-1; i >0; i--) {
		
	reversed =reversed+word.charAt(i);//returns character at specified index in a string	
	}
	
	System.out.println(reversed);
	
	}

}
