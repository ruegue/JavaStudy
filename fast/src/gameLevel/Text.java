package gameLevel;

public class Text {

	public static void main(String[] args) {

		Player kim = new Player();
		
		kim.play(1);
		
	AdvanceLevel blevel = new AdvanceLevel();
		
		
		kim.upgradeLevel(blevel);
		kim.play(4);
		
	}

}
