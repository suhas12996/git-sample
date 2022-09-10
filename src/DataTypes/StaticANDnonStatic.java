package DataTypes;

public class StaticANDnonStatic {

	String name="Suhas"; //non static global variable
	static int age=24;   //Static global variable
	
	public static void main(String[] args) {
		// FIXME Auto-generated method stub

			//How to call static methods and Variable?
			//1. Direct calling
			Sum();
		
			//2. Calling By Classname 
			StaticANDnonStatic.Sum();
			
			//1
			System.out.println(age);
			//2
			System.out.println(StaticANDnonStatic.age);
			
			//How to call non static methods and variables?
			//1. Creating object of the class and assigning the methods to the object reference variable.
			StaticANDnonStatic st=new StaticANDnonStatic();
			st.SendMail();
			System.out.println(st.name);
			
			//2. Can I access static methods by using object references ? Yes but its not the good approach as static methods should be accessed by static way itself.
			st.Sum(); 
			
			
	}

		public void SendMail() {  				//Non static methods
			System.out.println("Send mail");
		}
		
		public static void Sum() { 					//static methods
			System.out.println("Sum of the no's");
		}
}
