package javaCh4;

public class Exercise4_4 {

	public static void main(String[] args) {
		
		int num=0;
		int sum=0;
		int s=1;
		int j=0;
		for(int i = 1; sum <100 ; i++) {
			++j;
			sum=sum+i*(int)Math.pow(-1, i+1);
		}
	System.out.println(j);
	}

}
