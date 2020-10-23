package Week4;





public class Lap4Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*create a double array called prices
	 * assign 10 different prices
	 * using a loop count how many items that is more than $20
	 * print the count
	 * if no price was found that is more than $20 then print
	 * "No items that costs more than $20"
	 * 	
	 */
		
		
		
		

	double[] prices = {10.2,30.4,21.5,5.6,4.0,4.7,7.8,31.5,4.5,6.9};
	int count =0;
	for (int i = 0; i < prices.length; i++) {
		if (prices[i] >20) {
		count++;	
			
		
		}
	}
	if(count>0) {
	System.out.println(count + " number of Item is greater  than 20 ");
	}else {
		System.out.println( "there is  no Item is greater  than 20 ");
	}
	
	}
}
