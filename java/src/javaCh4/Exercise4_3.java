package javaCh4;

public class Exercise4_3 {

	public static void main(String[] args) {
		
		int tmp=0;
		for(int i =1; i<11; i++) {
			int sum=0;
			for(int j=1 ; j<=i ;j++) {
				sum+=j;
			}
			tmp+=sum;
		}
		System.out.println(tmp);
	}

}
