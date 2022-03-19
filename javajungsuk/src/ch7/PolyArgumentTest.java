package ch7;

class Product{
	int price = 0;
	int bonusPoint =0;
	
}

class Tv extends Product{
	int price;
	
	Tv(int price){
		this.price = price;
	}
	
	public String toString() {return "Tv";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을 구입하셧습니다. 가격은" + p.price);
	}
}


public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv(100));
	}

}
