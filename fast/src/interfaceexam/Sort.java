package interfaceexam;

public interface Sort {

	 void ascending();
	 void decending();
	 default void description() {
		 System.out.println("������ ���ϴ� �˰����Դϴ�.");
	 }
}
