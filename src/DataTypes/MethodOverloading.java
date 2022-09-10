package DataTypes;

class MethodOverloading
 { 
		public void square()
		{ 
			System.out.println("No Parameter Method Called");
		} 
		
		
		public int square(int d )
		{
			int square = (int) (d * d);
			System.out.println("Method with Integer Argument Called:"+square);
			return square; 
		}

		
		public float square( float number ) 
		{
			float square = number * number;
			System.out.println("Method with float Argument Called:"+square);
			return square; 
		}
		
		
		public static void main(String[] args)
		{
			MethodOverloading obj = new MethodOverloading();
			obj.square();
			obj.square(5);   
			obj.square(3);   
		}
 }