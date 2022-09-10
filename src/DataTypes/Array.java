package DataTypes;

public class Array {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		
		int i[]=new int[3];
		i[0]=30;
		i[1]=20;
		i[2]=10;
		
		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println("*******************");
		
		//using for loop to print the arrays
		
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
			System.out.println("******************");
		
		//Using object to store the values of all datatypes in a array
			
		Object ob[]=new Object[5];
		ob[0]=10;
		ob[1]=20.10;
		ob[2]='a';
		ob[3]="abcd";
		ob[4]=true;
		
		for(int k=0;k<5;k++) {
			System.out.println(ob[k]);
		}
		
		}

}
