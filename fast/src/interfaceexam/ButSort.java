package interfaceexam;

public class ButSort implements Sort {

	@Override
	public void ascending() {
		System.out.println("ButkSort ascending");
	}

	@Override
	public void decending() {
		System.out.println("ButSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("ButkSort ascending");
	}

}
