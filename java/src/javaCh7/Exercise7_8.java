package javaCh7;

class Outer3{
	int value = 10;
	
	class Inner2{
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(new Outer3().value);
		
		}
	}
}

public class Exercise7_8 {

	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner2 i = o.new Inner2();
		i.method1();
		
	}

}
