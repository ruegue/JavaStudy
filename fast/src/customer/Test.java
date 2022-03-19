package customer;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		
		Customer customerKim = new Customer("Kim");
		Customer customerPark = new GoldCustomer("Park");
		Customer customerKang = new VipCustomer("Kang");
		
		customerKim.pay(1000);
		customerPark.pay(1000);
		customerKang.pay(1000);
		
		
		ArrayList<Customer> List = new ArrayList<Customer>();
		
		List.add(customerKim);
		List.add(customerPark);
		List.add(customerKang);
		
		for(Customer list : List) {
			list.showInfo();
		}
	}

}
