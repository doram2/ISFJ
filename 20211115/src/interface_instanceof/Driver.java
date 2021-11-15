package interface_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {//vehicle 이 Bus로 만들어진 객체인가?
									//instanceof: 객체를 비교할 때 사용. 결과값은 boolean이다
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
