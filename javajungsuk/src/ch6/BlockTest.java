package ch6;

public class BlockTest {

	static {
		System.out.println("static{}");
	}
	
	{
		System.out.println("{}");
	}
	
	public BlockTest() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		
	}

}
