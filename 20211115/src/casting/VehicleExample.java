package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//자동형변환: 부모에 있는것만 사용가능
		vehicle.run();
		
		Bus bus = (Bus)vehicle;//버스로 형변환하여 버스로 사용가능 -> 강제형변환 자시객체에 있는것 사용가능
		bus.checkFare();
	}

}
