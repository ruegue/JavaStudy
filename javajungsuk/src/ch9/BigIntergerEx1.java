package ch9;

import java.math.BigInteger;

public class BigIntergerEx1 {

	public static void main(String[] args) {
		BigInteger val = new BigInteger("1234");
		
		String a = val.add(val).toString();
		
		System.out.println(a);
	}

}
