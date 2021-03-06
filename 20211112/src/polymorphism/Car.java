package polymorphism;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽", 6);
	Tire backRightTire = new Tire("뒤오른쪽",2);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");		//Ctrl+왼마: 부모 클래스 메소드로 넘어감
		if(frontLeftTire.roll() == false){stop();return 1;}
		if(frontRightTire.roll() == false){stop();return 2;}
		if(backLeftTire.roll() == false){stop();return 3;}
		if(backRightTire.roll() == false){stop();return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
