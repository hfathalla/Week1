package Week4;

public class recapClassQ2 {

	public static void main(String[] args) {
	
	/*2-  Calculate insurance rate (if else  --> hint: nested)
	 *      You have a company and have company cars. You wanna buy insurance
	 *  Liability Insurance
	 * car numbers         insurance price
	 *   1 car                750 (per car)
	 *    2-5 cars             550 (per car)
	 *    6-8 cars             450 (per car) 
	 *   9+                   350 (per car)
	 * 
	 *  Full insurance
	 *   car numbers         insurance price
	 *  1 car                1150 (per car)
	 *    2-5 cars             1050 (per car)
	 *    6-8 cars             900 (per car) 
	 *   9+                   800 (per car)
	 *     Example : There are 5 cars in my company i wanna liability.
             
	 *  I am gonna pay 550 per car
               totalInsurance 5 x 550
	 * 	
	 */
		
	int insuranceCars      =1;	
		
	int carNumber          = 5;
	
	int insurancePrices =550;
		
if (insuranceCars==1) {
	System.out.println("--------Liability insurance-------");
	if(carNumber==1) {
		insurancePrices = 750;
	}else if(carNumber>=2&&carNumber<=5) {
		insurancePrices = 550;	
	}else if(carNumber>=6&&carNumber<=8) {
		insurancePrices =450 ;	
	}else if(carNumber>=9) {
		insurancePrices = 350;	
	}
	
}else if (insuranceCars==2) {
	System.out.println("------ Full insurance-------");
	if(carNumber==1) {
	insurancePrices = 1150;
}else if(carNumber>=2&&carNumber<=5) {
	insurancePrices = 1050;	
}else if(carNumber>=6&&carNumber<=8) {
	insurancePrices = 900;	
}else if(carNumber>=9) {
	insurancePrices = 800;	
}
		
		
		
		
}	
	System.out.println("Total innssuranc price:" +insurancePrices*5);	

	}

}
