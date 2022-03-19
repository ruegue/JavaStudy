package javaCh6;

public class Exercise6_21 {

	public static int abs(int value) {
		if(value<0) {
			return value*-1;
		}
		return value;
	}
	public static void main(String[] args) {
		int value = -5;
		System.out.println(value + "의 절대값:" + abs(value));
	}

}
