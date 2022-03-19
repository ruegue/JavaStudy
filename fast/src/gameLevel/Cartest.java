package gameLevel;

import java.util.ArrayList;

public class Cartest {

	public static void main(String[] args) {

		
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Avnate());
		carList.add(new Grandeur());
		
		for(Car car : carList) {
			car.on();
			
		}
		
	}

}
