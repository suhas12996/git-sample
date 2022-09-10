package DataTypes;

public class globalVSlocalVariables {

	int age=25; 		  //Global variables of main class
	String name="Suhas";  //Global variables of main class
	
	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		int i=10; //Local variables of Main method
		System.out.println(i);
		
		globalVSlocalVariables gs=new globalVSlocalVariables(); //global variables only accessible after creating the object of that class
		System.out.println(gs.age);
		System.out.println(gs.name);	
	}
	
	public void Sum() {
		int i=20; //Local variables of Sum methods, Not able to access by Main menthods
		int j=21;
	}

}
