package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // 문제 발생 시 1,2,3,4값 return
			switch(problemLocation) {
			case 1: 
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 6);
				break;
			case 2: 
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽",4);
				break;
			case 3:
				System.out.println("뒤왼쪽 HanKookTire 교체");
				car.backLeftTire = new KumhoTire("뒤 왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽",17);
				break;
			}
		}

	}

}
