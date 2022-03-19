package ch9;

import java.util.Comparator;
import java.util.Objects;

public class ObjectsTest {

	public static void main(String[] args) {
		String[][] str2D   = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D_2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		Comparator c = String.CASE_INSENSITIVE_ORDER;
		
		System.out.println(Objects.compare("aa", "bb",c));
	}

}
