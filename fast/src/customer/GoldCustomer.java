package customer;

public class GoldCustomer extends Customer {

	

	double bonusPoint;
	
	
	public void showInfo() {
		System.out.println(customerName + "������" + price +"�� �����ϼ̰�" + bonusPoint + "����Ʈ�� �����Ǿ����ϴ�.");
	}
	
	
	public void pay(int price) {
		this.price = (int)(price*0.9);
		this.bonusPoint = (int)(price*0.02);
	
	}
	

	public GoldCustomer(String customerName) {
		super(customerName);
	}

}
