package javaCh9;

public class Exercise9_3 {
	
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while(true) {
			if(src.indexOf(target, pos)==-1) {
				return count;
			}else {
			src.indexOf(target, pos);
			++count;
			pos = target.length()+src.indexOf(target, pos);
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

}
