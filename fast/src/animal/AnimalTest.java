package animal;


class Animal{
	
	public void move() {
	System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �����Դϴ�.");
		}
	
	
}


public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Animal();
		Animal HAnimal = new Human();
		
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(HAnimal);
		test.moveAnimal(hAnimal);
		
	add();
	
	
	
		
	}
	
	public static void add() {
		System.out.println("��");
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
	
}
