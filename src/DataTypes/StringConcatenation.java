package DataTypes;

public class StringConcatenation {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		int a=10; 
		int b=20;
		
		double x=12.23; 
		double w=10.33;
		
		char k='m';
		char l='n';
		
		boolean y=true; //not possible to concatenate boolean values
		boolean z=false;
		
		String s="Hello";
		String s2="World";
		
		System.out.println(a+b);
		System.out.println(s+s2);
		System.out.println(a+b+x+w);
		System.out.println(a+k+b+l); //Have doubt on concatenation of char and int
		System.out.println(a+s+b+s2);
		System.out.println(y);
		System.out.println(s+s2+(a+b));
		

	}

}
