package gameLevel;

public class Grandeur extends Car {

	@Override
	public void run() {
		System.out.println("그렌져가 움직입니다.");
	}

	@Override
	public void drive() {
		System.out.println("그렌져가 수동으로 움직입니다.");
	}

	@Override
	public void stop() {
		System.out.println("그렌져가 엄춤니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("그렌져가 시동을 끕니다.");
	}

}
