package customer;

public class Customer {

	
	String customerName;
	int price;
	
	
	
	public void showInfo() {
		System.out.println(customerName + "������" + price +"�� �����ϼ̽��ϴ�.");
	
	
	}
	
	public void pay(int price) {
		this.price = price;
	}
		
	public Customer( String customerName) {
		this.customerName = customerName;
		
	}
	
	
	
}
