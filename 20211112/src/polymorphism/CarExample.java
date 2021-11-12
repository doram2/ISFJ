package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // ���� �߻� �� 1,2,3,4�� return
			switch(problemLocation) {
			case 1: 
				System.out.println("�տ��� HankookTire ��ü");
				car.frontLeftTire = new HankookTire("�� ����", 6);
				break;
			case 2: 
				System.out.println("�տ����� KumhoTire ��ü");
				car.frontRightTire = new KumhoTire("�� ������",4);
				break;
			case 3:
				System.out.println("�ڿ��� HanKookTire ��ü");
				car.backLeftTire = new KumhoTire("�� ����",14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire ��ü");
				car.backRightTire = new KumhoTire("�� ������",17);
				break;
			}
		}

	}

}
