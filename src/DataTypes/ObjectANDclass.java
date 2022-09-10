package DataTypes;

public class ObjectANDclass {
	
	Object model;
	int wheel;
	
	public static void main(String[] args) {
		// FIXME Auto-generated method stub

		
		ObjectANDclass a=new ObjectANDclass(); //new ObjectANDclass() is the object of the ObjectANDclass class
		ObjectANDclass b=new ObjectANDclass(); //new keyword used to create the Object.
		
		a.model="XUV300"; //a is the object reference variable
		a.wheel=4;
		
		b.model="XUV400"; //b is the object reference variable
		b.wheel=3;
		
		System.out.println(a.model);
		System.out.println(b.wheel);
		System.out.println(a.wheel);
		System.out.println(b.model);
		
	}

}
