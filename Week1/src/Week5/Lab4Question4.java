package Week5;

public class Lab4Question4 {
/*
	4. The algorithm below reversing string with for loop.
	Write two static Java methods (void and non-void) and place this algorithm inside your methods. Your methods need to use a parameter to receive the Strings. 
	*/
	
	public  static void silconLab( ) {
		String string = "Silicone Labs";
		for (int i = string.length()-1; i >=1; i--) {
			System.out.print(string.charAt(i));
		}	
	}
	public static String silconLab2 () {
		String string = "Silicone Labs";
		for (int j = string.length()-1; j >=1; j--) {
			System.out.print(string.charAt(j));
		}
		return string;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		silconLab();
		System.out.println();
	}

}
