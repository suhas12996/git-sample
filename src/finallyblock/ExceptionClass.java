package finallyblock;

public class ExceptionClass {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub

		ExceptionMethod();
	}
public static void ExceptionMethod() {
	int i=10;
	try {
			int k=i/0;
			System.out.println("exception will occur");
		
	}
	catch (Exception e) {
		System.out.println("Arithmetic Exception");
	}
	finally {
		System.out.println("this method will execute");
	}
}
}
