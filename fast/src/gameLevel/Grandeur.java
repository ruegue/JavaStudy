package gameLevel;

public class Grandeur extends Car {

	@Override
	public void run() {
		System.out.println("�׷����� �����Դϴ�.");
	}

	@Override
	public void drive() {
		System.out.println("�׷����� �������� �����Դϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�׷����� ����ϴ�.");
	}

	@Override
	public void turnoff() {
		System.out.println("�׷����� �õ��� ���ϴ�.");
	}

}
