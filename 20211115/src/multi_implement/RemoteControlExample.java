package multi_implement;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		Searchable sc = tv;
		RemoteControl rc = tv;

		sc.search("±Ë√·Ωƒ");
		rc.turnOn();
		rc.turnOff();
		tv.search("±Ë¿œ¿Ã");
		tv.turnOn();
		tv.turnOff();
	}

}
