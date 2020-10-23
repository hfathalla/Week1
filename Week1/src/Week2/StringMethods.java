package Week2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
	//Strings are not primitive data type (classes)	
String message = "Hello ";
String message1 = "World";

// Scanner scanner = new Scanner(System.in);

String message2 = new String ("Hello World !");

// concatenation - writing  string side by side 
System.out.println(message + message1);
System.out.println(message.concat(message1));

System.out.println(message.toUpperCase());

System.out.println("Hend".toUpperCase());
System.out.println(message2.toLowerCase());


System.out.println(message.length());
System.out.println(message2.substring(0,8).charAt(6));
System.out.println(message2.substring(0,8).toUpperCase());
// charAt

System.out.println("Hello World".charAt(9));

//equal()
String name = "java";
String name2 = "python";
System.out.println(name.equals(name2));

System.out.println("java".equals(name));

//equalsIgnoreCase(name2)
System.out.println(name.equalsIgnoreCase(name2));

//contains()methods
//System.out.println("Hend".


// indexOf()


//replace()
//System.out.println("Java".replace("J","l"));


//dataType arrayName[] = new dataType[lenghtOfArray]
//first way
int myArray[] = new int [4];
//default value is 0 for each index 

System.out.println(Arrays.toString(myArray));

myArray[0] = 29;
myArray[1] = 80;
myArray[2] = 17;
myArray[3] = 62;
System.out.println(Arrays.toString(myArray));
//second way
int myArray2[] = new int [] {4,5,6,7,8,9};
System.out.println(Arrays.toString(myArray2));
System.out.println(myArray2[0]);

//third way

int[] myArray3 = {9,8,7,6,5,4,3,2,1};
System.out.println(Arrays.toString(myArray3));

String[]myArray4 = {"Java","python","Sql","C++"};

System.out.println(myArray4[1]);

System.out.println(Arrays.toString(myArray4));

double[] myDoubleArray = {9.8,9.9,8,10};
System.out.println(Arrays.toString( myDoubleArray));

String[]myString = new String[3];

myString [0] = "hend";
myString [1] = "Fathalla";
System.out.println(Arrays.toString(myString));

boolean[]myBooleanArray = {true , false};
System.out.println(Arrays.toString(myBooleanArray));



//Classname objectname = new Classname ();
StringBuffer stringBuffer = new StringBuffer("silicon labs");
System.out.println(stringBuffer.reverse());











	}

}
