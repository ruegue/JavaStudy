package ch12;

enum Trans{
	Bus(100) {
		@Override
		int fare(int distance) {
			return distance*BASIC_FARE;
		}
	},	
	
	TRAIN(150){
		@Override
		int fare(int distance) {
			return distance*BASIC_FARE;
		}
	},	
	SHIP(100) {
		@Override
		int fare(int distance) {
			return distance*BASIC_FARE;
		}
	},	
	AIRPLANE(300) {
		@Override
		int fare(int distance) {
			return distance*BASIC_FARE;
		}
	};
	
	protected final int BASIC_FARE;
	
	Trans(int basicFare) {
		BASIC_FARE = basicFare;
	}

	public int getBasicFare() { return BASIC_FARE;}
	
	abstract int fare(int distance);
	
	
}

public class EnumEx3 {

	public static void main(String[] args) {
		System.out.println(Trans.Bus.fare(100));
	}

}
