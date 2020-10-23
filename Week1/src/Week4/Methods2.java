package Week4;

public class Methods2 {

	

void method1(){
 //access modifier :default
//non-static methods
//we need to create object to call this method	
	
	 System.out.println("this is method 1");	
    }
    
    static void method2(){
    	 //access modifier :default
    	//static methods		
    	 System.out.println("this is method 2");	  
    }
    public static void method3(){
    	 //access modifier :publiccan be accessed from everywhere in a project
    	//static methods		
    	 System.out.println("this is method 3");	 
    }
    public void method4(){
    	 //access modifier :public
    	//non-static methods
    	//we need to create object to call this method	
    	 System.out.println("this is method 4");	   
    }
    private static void method5() {
    	
    	 //access modifier :private, can be called within only this class
    	//static methods
    System.out.println("this is method 5");	
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	method3();	
		
	Methods2 object =new Methods2();	
		
	object.method1();	
	
	method2();
	object.method4();
	method5();
	}

}
