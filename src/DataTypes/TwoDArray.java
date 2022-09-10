package DataTypes;

public class TwoDArray {

	public static void main(String[] args) {
		// FIXME Auto-generated method stub
		int x[][]=new int[2][3];
		x[0][0]=20;
		x[0][1]=25;
		x[0][2]=30;
		
		x[1][0]=35;
		x[1][1]=40;
		x[1][2]=45;

		
		System.out.println(x.length);
		
		for(int k=0; k<x.length; k++) {
			for(int j=0; j<x[0].length; j++) {
				System.out.println(x[k][j]);
			}
		}
	}
}
