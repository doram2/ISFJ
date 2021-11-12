package method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//Vehicle vehicle = new Vehicle();
		//Vehicle 이 추상클래스 이므로 객체 생성 불가능
		driver.drive(bus);
		driver.drive(taxi);

	}

}
