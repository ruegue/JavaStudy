package javaCh7;

class Product
{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	Product(){}
}

class Tv extends Product{
	Tv() {}
	
	public String toString() {
		return "TV";
	}
}


public class Exercise7_3 {

	public static void main(String[] args) {
		
	}

}
