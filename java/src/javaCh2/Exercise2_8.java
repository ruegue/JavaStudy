package javaCh2;

public class Exercise2_8 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int g = x;
		x = y;
		y = z;
		z = g;
		
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
