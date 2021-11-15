package interface_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {//vehicle �� Bus�� ������� ��ü�ΰ�?
									//instanceof: ��ü�� ���� �� ���. ������� boolean�̴�
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
