package customer;

public class VipCustomer extends Customer {

	
	
	double bonusPoint;
	
	
	
	public void showInfo() {
		System.out.println(customerName + "������" + price +"�� �����ϼ̰�" + bonusPoint + "����Ʈ�� �����Ǿ����ϴ�.");
		System.out.println("���� �̿��� �����մϴ�.");
	}
	
	
	public void pay(int price) {
		this.price = (int)(price*0.8);
		this.bonusPoint = (int)(price*0.05);
	
	}
	
	
	
	
	public VipCustomer(String customerName) {
		super(customerName);
	}

}
