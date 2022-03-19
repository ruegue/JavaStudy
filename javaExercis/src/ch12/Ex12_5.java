package ch12;

enum Direction { EAST, SOUTH, WEST, NORTH}

public class Ex12_5 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println(d1.compareTo(d2));
		
	}

}
