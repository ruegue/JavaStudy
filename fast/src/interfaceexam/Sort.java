package interfaceexam;

public interface Sort {

	 void ascending();
	 void decending();
	 default void description() {
		 System.out.println("순서를 정하는 알고리즘입니다.");
	 }
}
