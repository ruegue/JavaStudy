package ch9;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		Random rand = new Random(2);
		Random rand2 = new Random(1);
		
		System.out.println(rand.nextInt(6));
		System.out.println(rand2.nextInt(6));
	}

}
