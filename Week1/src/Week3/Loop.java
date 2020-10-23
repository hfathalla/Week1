package Week3;

import java.util.Arrays;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  print Hello Silicone labs 1 time
		System.out.println("Hello Silcone Labs");
	
// 	 print Hello Silicone labs 999 time	
		for (int i = 0; i < 999; i++) {
			System.out.println(i+":Hello Silcone labs");	
		}
	//looping trough array
		int [] arr1= {3,4,5,6,7,8,9,12,14};
		
		for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]+4);	
		}
		//I put initialization step to outside of the for loop
		int count = 0;
		for (;count<5;count++) {
		System.out.println(count +": count");	
			
		}
		// for loop with decreasing number
		for (int i = 5; i > 0; i--) {
		System.out.println(i+ " =i");	
			
		}
		//for loop with increasing numbers by 2
		for (int i =0; i<10; i+=2) {//i = i+2
		System.out.println("i:" + i);	
		}
		//for loop with increasing numbers by 2
				for (int i =1; i<10; i *=2) {//i=i*2
				System.out.println("i:" + i);	
				
			}
		//creat a program that find odd - even number in a number of give 
				for (int i = 0; i <19; i++) {
				if (i%2==0) {
				System.out.println(i +"is an even number");	
				}else {
				System.out.println(i+"is an odd number ");	
				}
					
				}
				
			int []arr2 = {4,5,6,7,8};
			//for enhanced loop
			for (int i :arr2) {
				System.out.println(i);
			}
			
			int j = 0;
			//increasing number
			while(j<10) {
			System.out.println(j);
			j++;
			
			}
			//decreasing number
			while(j>-10) {
				System.out.println(j);
				j--;
			}
//			int j = 0;
//			//loops trough the array int []arr2= {4,5,6,7,8};
//			while (j<arr2.length) {
//				System.out.println(arr2[j]);
//				j++;
//			}
		/*	
		*
		**	
		***	
		****	
		*****	
		******	
		*/	
		String string = "";	
		int count1  = 0;	
		while (count1<10) {	
		string = string +"*";	
		System.out.println(string);	
			
		count1++;	
			
		}	
		int count2 =0;	
		while(count2<14) {
		System.out.println(count2);	
		count2++;
		break;//break statments kills the loop
		}
		int count3 =0;
		while(count3<14) {
		if (count3%2==0) {
			System.out.println(count3 +"is an even number");	
			}else {
			System.out.println(count3+"is an odd number ");	
			}
			count3++;	
		
		
		}
		//Diffrence between while and do while is dowhile loop is going to run at least one time 
		//no matter what my condition is
		int count4 = 0;
		do {
		System.out.println(count4);
		count4++;
		}while(count4<6);
		
		boolean condition = false;
		
		while (condition) {//while loop check the condition before executing the statement 
			//therefore, if the condition is false ,statement inside of the loop body is not gonna be executed
		System.out.println("Inside of while loop");	
		}
		
		do {
			//do while loop check the condition after executing the  first statement 
			//therefore, if the condition is false ,statement inside of the loop body is not gonna be executed 1 time
		System.out.println("Inside of do whileloop");	
		} while (condition);
		
		//two dimensional array
		int [][]twoDimArray = {{1,2,3,4},{9,8,7,6}};
		for (int  outerSet= 0; outerSet<2;outerSet++ ) {
			
			
			for (int  innerSet= 0; innerSet<4;innerSet++ ) {
		System.out.println(twoDimArray[outerSet][innerSet]);
		
			}
		
		}
		System.out.println(twoDimArray[0][1]);
		
		

        int arr [] ={1,2,3,4,5}; // lenght = how many elements does array have
        System.out.println(arr.length);
        arr[4] = 99;
        System.out.println("Highest index number : "  +(arr.length -1));
        System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
	}

}
