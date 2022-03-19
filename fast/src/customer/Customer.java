package customer;

public class Customer {

	
	String customerName;
	int price;
	
	
	
	public void showInfo() {
		System.out.println(customerName + "°í°´´ÔÀº" + price +"¸¦ ÁöºÒÇÏ¼Ì½À´Ï´Ù.");
	
	
	}
	
	public void pay(int price) {
		this.price = price;
	}
		
	public Customer( String customerName) {
		this.customerName = customerName;
		
	}
	
	
	
}
