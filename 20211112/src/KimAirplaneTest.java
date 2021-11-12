
public class KimAirplaneTest {

	public static void main(String[] args) {
		KimAirplane ex = new KimAirplane();
		ex.fly();
		ex.flyMode = KimAirplane.SUPERSONIC;
		ex.fly();
		ex.flyMode = KimAirplane.NORMAL;
		ex.fly();
	}

}
