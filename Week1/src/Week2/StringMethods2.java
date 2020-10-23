package Week2;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Good Evening Silicone Labs");
	
	String username = "fathalla";
	
	boolean myVariable = username.equals("fathalla");	
		
	if (myVariable)	{
	System.out.println("Hello From iside of The If block");	
		
	}else {	
	System.out.println("Hello from inside of the else block");	
	}	
	System.out.println("Good Evening Silicon Labs again!");	

	
	int num1 = 0;
	// creat a program wich find if number is negative or positive
	
	if(num1>0) {
	System.out.println("your number is positive");
	
	}else if(num1==0) {
	System.out.println("your number is zero");
	
	}else {
	System.out.println("your number is negative");	
	}
	
	// checks my grade and finds the eguivilant letter grade
	//9-100,A
	//80-90.B
	//70-80,c
	//60-70,D
	//0-60,f
	// question : if grade above 100 ,print ("invalid grade ")
	//if your grade is negatine print ("invaild grade ")
	int grade = -35;
	if(grade>90) {
	System.out.println("A");
	
	}else if (grade>80) {
	System.out.println("B");
	
	}else if (grade>70) {
	System.out.println("C");
	
	}else if (grade>60) {
	System.out.println("D");
	
	}else if (grade>100) {
	System.out.println("invalid grade");
	
	}else if (grade>-45) {
	System.out.println("ivalid grade");	
	
	}else {
	System.out.println("F");	
	}
	//in order to donate blood you need to be over 80 kg, and older than 18 yrs
	int  age = 15;
	
	int weight = 60;
	
	if (age >18) {
	   if (weight>50) {
		System.out.println("you can donate blood!"); 
		
	   }else {
		System.out.println("you need to be over 50 kg");   
	   }
	   
	}else if (age< 18 &&weight<60 ) {
	System.out.println("your age and your weight is not enough");	
	   
	
	}else {
	System.out.println("you need to be older than 18");	
	}
	
	//Interview Question 
	
	//Extract the number out of the string
	String string = "kjbrvbir98765:::";
	//replaceAll
	//string = string.replaceAll("[a-z:]", "");
string = string.replaceAll("[^0-9]","");	
//	string = string.replaceAll("[^v]","");
//	string = string.replaceAll("[^0-3]","");
	System.out.println(string);
	
	
//StringBuilder	
StringBuilder stringBuilder = new StringBuilder("This is a string");	
//append method is concatinating two string	
stringBuilder.append("builder ! ");
System.out.println(stringBuilder);
stringBuilder.setCharAt(0, 'L');
System.out.println(stringBuilder);
System.out.println(stringBuilder.reverse());	
	
	
	
	
	
	
	
	
	}

}
