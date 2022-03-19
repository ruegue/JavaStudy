package ch12;

import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy {public String toString() {return "Toy";}}

interface Eatable{}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		FruitBox<? extends Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Grape> appleBox = new FruitBox<Grape>();
	

		
		
		System.out.println(Juicer.makeJuice(fruitBox));
	}

}

class Juice{
	String name;
	
	Juice(String name) {this.name = name + "Juice";}
	public String toString() {return name;}
}


class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList()) 
			tmp += f + " ";
			return new Juice(tmp);
		
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) {return list.get(i); }
	ArrayList<T> getList() { return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
