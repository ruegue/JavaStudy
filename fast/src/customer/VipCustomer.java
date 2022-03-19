package customer;

public class VipCustomer extends Customer {

	
	
	double bonusPoint;
	
	
	
	public void showInfo() {
		System.out.println(customerName + "고객님은" + price +"를 지불하셨고" + bonusPoint + "포인트가 적립되었습니다.");
		System.out.println("상담원 이용이 가능합니다.");
	}
	
	
	public void pay(int price) {
		this.price = (int)(price*0.8);
		this.bonusPoint = (int)(price*0.05);
	
	}
	
	
	
	
	public VipCustomer(String customerName) {
		super(customerName);
	}

}
