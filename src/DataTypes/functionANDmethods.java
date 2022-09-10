package DataTypes;

public class functionANDmethods {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
			
		functionANDmethods f1=new functionANDmethods();
		
		f1.Test(); //To print the values in metho-1
		
		int S=f1.Sum(); //To print the values in method-2
		System.out.println(S);
		
//First need to create the objects of the methods with return types and later need to map the main method reference variable to the Void method.
		
		int D=f1.division(30,10); //To print the values in method-3
		System.out.println(D);	
	}	
	
	
		// method-1: No input, No Outoput 
		public void Test() {
			System.out.println("No input, No Outoput");
		}
		
		// method-2: No input, Some Outoput 
		public int Sum() {
			System.out.println("No input, Some output");
			int a=10;
			int b=20;
			int sum;
			sum=a+b;
			return sum;			
		}
		
		// method-3: Some input, Some Outoput 
		public int division(int x, int y) {
			System.out.println("Some input, Some output");
			int d=x/y;
			return d;
		}
		//To print all these values in Console we need to write the object reference for each method in main methods.

}
