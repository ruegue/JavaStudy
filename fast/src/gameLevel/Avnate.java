package gameLevel;

public class Avnate extends Car {

	@Override
	public void run() {
		System.out.println("아반테가 움직입니다.");
	}

	@Override
	public void drive() {
		System.out.println("아벤테가 수동으로 움직입니다.");
	}

	@Override
	public void stop() {
		System.out.println("아반테가 멈춤니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("아벤테가 시동을 끕니다.");
	}

}
