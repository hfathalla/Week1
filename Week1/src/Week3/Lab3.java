package Week3;

import java.util.Scanner;



public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//------->1
//
//		int y = 0;
//		int x;
//		if(y==0) {
//		x=100;
//		System.out.println("x value is :"+ x);
//		}
//	-------->2	
//	int y = 10;	
//	int x ;	
//	if (y==10) {
//		x = 0;
//		System.out.println("x value is :" + x);		
//	}else {
//	x= 1;
//	System.out.println("x value is :" + x);	
//	}
//		
//	Scanner scanner = new Scanner(System.in);	
//	System.out.println("what is the sales number?");	
//	double sales = scanner.nextDouble();	
//		
//	double	 commission;
//	
//	if (sales>0&&sales<=10000) {
//		commission = 0.10;
//		System.out.println("the commission rate is :"+commission);
//	}else if (sales >= 10001 && sales<=15000) {
//		commission = 0.15;
//		System.out.println("the commission rate is :"+commission);
//	}else {
//	commission = 0.20;
//	System.out.println("the commission rate is :"+commission);
//	}
//
//	
//	
		Scanner scanner = new Scanner(System.in);	
		System.out.println("please enter the number?");	
		int number = scanner.nextInt();	
			
	
	if (number % 2 == 0) {
	
		
	System.out.println("the number is even");
	}else {
		System.out.println("the number is old");	
	}
		
	}

}
