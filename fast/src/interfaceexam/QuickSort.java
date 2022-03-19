package interfaceexam;

public class QuickSort implements Sort{

	@Override
	public void ascending() {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void decending() {
		System.out.println("QuickSort decending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort¿‘¥œ¥Ÿ.");
		
	}

}
