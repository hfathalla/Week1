package Week4;

import java.util.Scanner;

public class ReviewQuestions {

	
public  static void finalMiddle(String str) {

int position;
int length;
	
if (str.length() % 2 == 0)
{
    position = str.length() / 2 - 1;
    length = 2;
}
else
{
    position = str.length() / 2;
    length = 1;
}
System.out.println(str.substring(position, position + length));
}	




public static void average()
{
Scanner in = new Scanner(System.in);
	System.out.print("Input the first number: ");
     double x = in.nextDouble();
    System.out.print("Input the second number: ");
     double y = in.nextDouble();
    System.out.print("Input the third number: ");
     double z = in.nextDouble();
    System.out.print("The average value is " +"\n" );
    System.out.println((x + y + z) / 3);
}	
	
	
public static void findSmallest() {

	Scanner in = new Scanner(System.in);
    System.out.print("Input the first number: ");
    double x = in.nextDouble();
    System.out.print("Input the Second number: ");
    double y = in.nextDouble();
    System.out.print("Input the third number: ");
    double z = in.nextDouble();
    double smallestV = Math.min(Math.min(x, y),z);
    System.out.println(smallestV);
}
	
public static  void finalVowel(String str) {

    int count = 0;
    
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.println(count);	
}	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
finalMiddle("Eslam");
//average();
//findSmallest();
finalVowel("eslam");
	}

}
