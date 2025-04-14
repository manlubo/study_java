package lesson07;

public class Tv {
	// 필드 (멤버 변수)
	// 전원, 채널, 볼륨
	
	// 메서드 (함수, 기능)
	// 전원 조절, 채널 업&다운, 볼륨 업&다운
	
	boolean power;
	int channel;
	int volume;
	
	void doPower() {
		power = !power;
	}
	
	
	// 채널 조절
	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
	
	
	// 볼륨 조절
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
}
