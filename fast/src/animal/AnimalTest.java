package animal;


class Animal{
	
	public void move() {
	System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
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
		System.out.println("야");
	}

	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
	
}
