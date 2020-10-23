package Week4;



public class Lap4Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*create an array and assign 10 different elements.
	 * Loop through the array and search for 100,
	 * If you can find 100 inside of the array, print : "value found at index "+index
	 * if that search value is not found print "100 not found in the array"
	 * After you find 100 then exit the loop(break statement) at that point, we are looking for
	 * only the first 100. not all of them	
	 */
int [] elments = {10,20,30,40,50,60,70,80,90,100};

for (int i = 0; i <elments.length; i++) {
	
	if (elments[i] ==100 ) { 
		System.out.println( "value found at index "+i);
		break;
			}else {
			System.out.println("100 not found in the array");
			break;
			}
         }


	}

}
