package multi_implement;

import interface_declaration.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{ //클래스와 인터페이스 간에는 다중 상속 가능
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url+" 을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {}

}
