package Week1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    byte myByte = 90;
    System.out.println("My Byte :" + myByte );
    
    short myShort = 8000; 
    System.out.println("My Short :" + myShort );
     
    int number1 = 10;
    System.out.println("My number 1:" + number1 );
    
    int number2 = 50;
    System.out.println("My number 2:" + number2 );
    
    int sum, product;//sum = number1 +number2,  product = number1*number2
    sum = number1 + number2;
    product = number1*number2;
    
    System.out.println("My Sum :" + sum);
    System.out.println("My product :" +product);
    
    long longVariable = 1000000l; // we are using L after declaring the lomg variable
    System.out.println("My Long :" + longVariable);
    
    double wighOfAdam = 0.000000001;
    System.out.println("My double :" + wighOfAdam);
    
    float myFloat = 5.9f; 
    System.out.println("My float :" + myFloat);	
    
    boolean myBoolean = true;
    
    char myChar = '*';
    
    System.out.println(myChar);
    System.out.println((int )myChar); //casting
    
 int numb1 = 90;
 int numb2 = 70;
    
    
  numb1 = numb2;  //numb1 = 70;
    
  System.out.println("Number 1 : " + numb1);  
    
    
  numb1 += numb2;  // numb1 = numb1 + numb2  
  System.out.println("Number 1 : " + numb1);  
    
  numb1 -= numb2;  // numb1 = numb1 - numb2    
  System.out.println("Number 1 : " + numb1); 
    
    
  numb1 *= numb2;  // numb1 = numb1 * numb2   
  System.out.println("Number 1 : " + numb1); 
  //numb1 = 4900
  numb1--;//numb1 = numb1-1   ---->numb1=4899
  System.out.println("Number 1 : " + numb1); 
  
  //numb1 =4899
  numb1++;//numb1 +1  --->numb1= 4900
  System.out.println("Number 1 : " + numb1); 
  
  
  //numb1= 4900
  
  numb1 +=9; //numb1 = numb1+9 :--->4909
  System.out.println("Number 1 : " + numb1); 
  
  //Boolean logic : or   ---and 
  
  // || or if one of the left side or right side is true then it is going be true 
  //&& if left side and right side is true then it is going be true
  
  
  
  
  
  
  
	}

}
