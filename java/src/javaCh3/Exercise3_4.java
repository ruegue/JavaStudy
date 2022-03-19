package javaCh3;

public class Exercise3_4 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOFBucket =  numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
				
		System.out.println("필요한 바구니 수:"+numOFBucket);
	}

}
