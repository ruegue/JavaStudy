package javaCh7;

class SutdaDeck{
		final int CARD_NUM = 20;
		SutdaCard[] cards = new SutdaCard[CARD_NUM];
		
		SutdaDeck() {
			SutdaCard s = new SutdaCard();
			int j = 0;
			for(int i=0; i<=9 ; i++) {
				if(i == 0 || i == 2 || i == 7) {
				cards[i] =  new SutdaCard(i+1, true);
				}else {
				cards[i] =  new SutdaCard(i+1, false);
				}
			}
			for(int i=10; i<=19 ; i++) {
				cards[i] =  new SutdaCard(++j, false);
			}
		}
		public void shuffle() {
			for(int i =0; i<cards.length ; i++) {
				SutdaCard tmp = null;
				int j = (int)(Math.random()*cards.length);
				tmp = cards[i];
				cards[i] = cards[j];
				cards[j] = tmp;
			}
		}
		
		public SutdaCard pick(int index) {
			return cards[index];
		}
		
		public SutdaCard pick() {
			return cards[(int)(Math.random()*cards.length)];
		}

}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_2{
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i =0 ; i< deck.cards.length ; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		System.out.println();
		System.out.print(deck.pick(0));
	}
}