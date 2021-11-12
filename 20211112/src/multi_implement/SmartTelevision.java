package multi_implement;

import interface_declaration.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{ //Ŭ������ �������̽� ������ ���� ��� ����
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url+" �� �˻��մϴ�.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {}

}
