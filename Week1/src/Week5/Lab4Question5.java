package Week5;

public class Lab4Question5 {
/*
	5. This algorithm  finds the duplicate element in String arrays :
		Convert this algorithm in a way to make it work in int arrays.
		Create a method for this algorithm and place it inside of the method.
	*/
	public  static void array(int[]name) {
		//int [] name = {1,2,3,4,5,6};
		//String[] names = {" Java" ,"JavaScript", "Python", "C", "Ruby", "Java" };
		System.out.println("Finding duplicate elements in array using brute force method"); 
					for (int i = 0; i < name.length; i++) { 
						for (int j = i + 1; j < name.length; j++) { 
							if (name[i]==(name[j]) ) {
								// got the duplicate element 
								System.out.println(name[j]);
						}
	
					
			}
		}					
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] name = {1,2,3,4,5,6,3,6};	
        array(name);
	}

}
