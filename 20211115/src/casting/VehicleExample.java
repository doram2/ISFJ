package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//�ڵ�����ȯ: �θ� �ִ°͸� ��밡��
		vehicle.run();
		
		Bus bus = (Bus)vehicle;//������ ����ȯ�Ͽ� ������ ��밡�� -> ��������ȯ �ڽð�ü�� �ִ°� ��밡��
		bus.checkFare();
	}

}
