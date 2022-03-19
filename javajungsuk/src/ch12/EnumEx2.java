package ch12;

enum Direction{
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

	private static final Direction[] DIR_ARR = Direction.values();
	private final int value;
	private String symbol;
	
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {return value;}
	public String getSymbol() {return symbol;}
	public String toString() {
		return name()+ getSymbol();
	}
}


public class EnumEx2 {

	public static void main(String[] args) {
		for(Direction d : Direction.values()) {
			System.out.println(d.getValue());
		}
		
		Direction d1 = Direction.EAST;
		
		System.out.println(d1);
	}

}
