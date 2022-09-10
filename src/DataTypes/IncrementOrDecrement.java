package DataTypes;

public class IncrementOrDecrement {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		//Post-Increment
		int i=1;
		int j = i++;
		System.out.println(i);//2
		System.out.println(j); //1
		
		//Pre-increment
		int x=3;
		int y=++x;
		System.out.println(x);//4
		System.out.println(y);//4
		
		//Post-decrement
		int c=5;
		int d=c--;
		System.out.println(c);
		System.out.println(d);
		
		//Pre-decrement
		int h=9;
		int g=--h;
		System.out.println(h);
		System.out.println(g);
	}

}
