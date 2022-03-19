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
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "�� �����ϼ˽��ϴ�. ������" + p.price);
	}
}


public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv(100));
	}

}
