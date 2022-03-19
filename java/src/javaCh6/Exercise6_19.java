package javaCh6;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUNE = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	void turnOnOff() {
		this.isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		if(MAX_VOLUNE>volume)
			volume++;
		}
	void volumeDown() {
		if(MIN_VOLUME<volume) {
			volume--;
		}
	}
	void channelUP() {
		if(this.channel == MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
		}
		else {
			channel++;
		}
	}
	void channelDown() {
		if(this.channel == MIN_CHANNEL ) {
			this.channel = MAX_CHANNEL;
		}
		else {
			channel--;
		}
	}
}
class Exercise6_19 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ",VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUP();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ",VOL:" + t.volume);
	}
}

