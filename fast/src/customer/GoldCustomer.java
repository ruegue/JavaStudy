package customer;

public class GoldCustomer extends Customer {

	

	double bonusPoint;
	
	
	public void showInfo() {
		System.out.println(customerName + "고객님은" + price +"를 지불하셨고" + bonusPoint + "포인트가 적립되었습니다.");
	}
	
	
	public void pay(int price) {
		this.price = (int)(price*0.9);
		this.bonusPoint = (int)(price*0.02);
	
	}
	

	public GoldCustomer(String customerName) {
		super(customerName);
	}

}
