package Week4;

import java.util.Arrays;

public class Methods {
public static void printOut(String print ) {
	System.out.println(print + "so much");
	
	
	
}
public static void addNumber(int a,int b,int c) {
int addition = a + b + c;
System.out.println(addition);
	
}

public static void printArray(int[]source) {
	System.out.println(Arrays.toString(source));//printing values of the array
}

public static void printArray(String[]source) {//OverLoding of printArray method
	System.out.println(Arrays.toString(source));//printing values of the array

}

public static void areaOfTringle(int height,int base) {
	System.out.println((height*base)/2);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
//helloWorld();//calling  hello world method
printOut("I love java ");

addNumber(1, 2, 3);

int[] arr = {1,2,3,4};
int[] arr1 = {5,6,7,8,9};
String [] names = {"hend","Eslam","selim"};
printArray(arr);//arr = 1,2,3,4
printArray(arr1);
printArray(names);

areaOfTringle(3, 5);
areaOfTringle(3, 10);

	}
	
public static void helloWorld() {
	System.out.println("helloWorld");
	System.out.println("hello Silicon Labs");
  }
}
