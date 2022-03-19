package javaCh9;

public class Exercise9_5 {

	public static String delChar(String src, String delCh) {
		
		StringBuffer s = new StringBuffer(src.length());
	
		for(int i=0; i<src.length();i++) {
			if(delCh.indexOf(src.charAt(i))==-1) {
				s.append(src.charAt(i));
			}
		}
		return s.toString();
	}
		
	public static void main(String[] args) {
		System.out.println(delChar("(1(!2@3^4~5", "~!@#$%^&*()"));
		System.out.println(delChar("(1 2 3 4\t5)", " \t"));
	}

}
