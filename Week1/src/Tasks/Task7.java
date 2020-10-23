package Tasks;

import java.util.ArrayList;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//write a java program which will add only even number to list from array of integers 	
		
	//{100,2,4,5,6,7,8,9,10}	
	//{2,4,6,8,10}	
	
	int array[]	 ={100,2,4,5,6,7,8,9,10};
		
	ArrayList<Integer>list = new ArrayList<>();	
	for (Integer  num : list) {
		if (num % 2==0) {
		list.add(num);
		
		}
		
	}
	System.out.println(list);
	}

}
