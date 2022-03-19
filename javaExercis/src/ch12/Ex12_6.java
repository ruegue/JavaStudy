package ch12;

enum Direction2 {
	EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
		
	}
	
	public int getValue() { return value;}
	public String getSymbol() {return symbol;}
	
	public static Direction2 of(int dir) {
		if(dir <1 || dir >4) 
			throw new IllegalArgumentException("Invalid value :" + dir);
			
		return DIR_ARR[dir -1];
		
	}
	
	public Direction2 rotate(int num) {
		num = num%4;
		
		if(num<0) num +=4;
		
		return DIR_ARR[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+getSymbol();
	}
}

public class Ex12_6 {

	public static void main(String[] args) {
		Direction2 d1 = Direction2.EAST;
		
		System.out.println(Direction2.EAST.rotate(2));
		}
}
