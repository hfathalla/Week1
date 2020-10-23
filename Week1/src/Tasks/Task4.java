package Tasks;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a java program to convert an array to arrayList
String names[] = {"Hend" ,"Eslam","Selim","Mohanna"	};

ArrayList<String > namelist = new ArrayList<>();

System.out.println(namelist);
for (String s : names) {
	
	namelist.add(s);
	
	
}
System.out.println(namelist);

		
	}

}
