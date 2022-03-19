package gameLevel;

public abstract class Car {

	public abstract void run();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void on() {
		run();
		drive();
		stop();
		turnoff();
	}
	
	
}
