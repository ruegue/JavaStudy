package gameLevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("�ſ� ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�ſ� ���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�ڷ� ������ ���ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=======���� �����Դϴ�.");
	}

}