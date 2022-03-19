package javaCh6;

public class Exercise6_20 {

	public static int max(int[] arr) {
		if(arr == null || arr.length ==0)
			return -99999;
		int max =0;
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println("�ִ밪:" + max(new int[] {}) );
	}
}
