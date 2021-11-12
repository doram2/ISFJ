package interface_declaration;

public interface RemoteControl {//생성자x, 필드x, 일반 메소드x, 생성자x
								//상수와 추상메소드로만 구성
	
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//Java8 부터 추가 - default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리를 한다.");
		}
		else {
			System.out.println("무음 해제를 한다.");
		}
	}
	
	//static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
