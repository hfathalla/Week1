package Week4;

import java.util.ArrayList;

public class MethodsExplained2 {
	
public static String hellosiliconLabs() {
	
	return"Hello silicon Labs";
}
int square(int number) {
return number*number;	
}
public static void helloWorld(){
System.out.println("Hello world");	
}
String printOut(String print) {
return print+"!";	
}
static ArrayList<String>arrayListMethod(){
ArrayList<String>arrayList = new ArrayList<>();	
arrayList.add("Hend Eslam");
return arrayList;
}
//overlooding methods

static int  calclate1(int a,int b) {
	return a+b;
}
static int  calclate1(int a,int b,int c) {
	return a+b+c;
}
static int  calclate1(int a,int b,int c,int d) {
	return a+b+c+d;
}
	public static void main(String[] args) {
		
	System.out.println(calclate1(5,6));
	System.out.println(calclate1(5,6,7));
	System.out.println(calclate1(5,6,7,8));
	
  helloWorld();//" Hello Silicon Labs",calling this method right now useless

  System.out.println(hellosiliconLabs() + " I love java");
  MethodsExplained2 object= new MethodsExplained2()
		  ;
  System.out.println(object.square(7)+88);
  System.out.println(object.printOut("Slack"));
  System.out.println(arrayListMethod()+" do anything :D");
	}

}
