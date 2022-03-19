package ch9;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));
		

		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String a1 = "abc";
		String a2 = "abc";
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}

}
