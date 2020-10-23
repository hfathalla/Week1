package Week4;

public class lap4Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*This program uses a loop to calculate the sum of the Elements in the array and prints it
 * int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234};
 * int sum = 0;
 * int sumOfEvens = 0;
 * int sumOfOdds = 0;
 * for (int i = 0; i < nums.length; i++){
 *  sum = sum + nums[i];
 * }```
 * - calculate sum of even numbers
 *  calculate sum of odd numbers
 */	
		
		int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234};
		int sum = 0;
		int sumOfEvens = 0;
		int sumOfOdds = 0;
				
			for (int i = 0; i < nums.length; i++) {
			
				 sum = sum + nums[i];
				 if(nums[i] % 2==0) {
					 sumOfEvens	 = sumOfEvens +nums[i];
				 
			}else {
				 sumOfOdds	 = sumOfOdds +nums[i];
			 
				
			}
			 
			 
		}
			System.out.println("the sum of erray: " + sum); 
			System.out.println("the sum of Even : "  + sumOfEvens); 
			System.out.println("the sum of Odd  : " + sumOfOdds);
	}

}
