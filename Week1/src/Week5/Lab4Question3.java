package Week5;

public class Lab4Question3 {
/*
	3. The algorithm below calculates the sum of the digits in an integer. (e.g. 888 = 24, 321 = 6) 
	Write two static Java methods (void and non-void) and place this algorithm inside your methods. Your methods need to use a parameter to receive the numbers. 
		
	*/
	public static  void calculate1 (int n) {
		 // this can be any number
		int result = 0;
				
				while(n > 0) {
					result += n % 10;
					n /= 10;
				}
		System.out.println(result);		

	}
	public static int  calculat2(int n) {
		// this can be any number
		int result = 0;
				
				while(n > 0) {
					result += n % 10;
					n /= 10;
				}
		
		return result;
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate1(500);
		System.out.println( calculat2(300));
	}

}
