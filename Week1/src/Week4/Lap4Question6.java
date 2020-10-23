package Week4;

public class Lap4Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----->6)Write a loop that displays 10 rows of '$’' characters. There should be 15 '$’' characters in each row. 
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("$$$$$$$$$$$$$$$");
		}
	
		
//------>7)	 Write a loop to draw this pattern, space between dollar signs increase by one at every line.		
/*
   $$
   $ $ 
   $  $ 
   $   $ 
   $    $ 
   $     $ 
 */ 
String space = " ";
		for (int i = 0; i < 5; i++) {
		space = space +" ";	
		System.out.println("$" + space + "$");
		}
		
	}

}
