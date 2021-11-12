package interface_declaration;

public class RemoteControlNoNameExample {
	
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("CD�� �մϴ�.");	
			}
	
			@Override
			public void turnOff() {
				System.out.println("CD�� ���ϴ�.");
				
			}
	
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					vol = RemoteControl.MAX_VOLUME;
				}
				else if(volume < RemoteControl.MIN_VOLUME) {
					vol = RemoteControl.MIN_VOLUME;
				}
				else {
					vol = volume;
				}
				System.out.println("���� cd������ "+vol+" �Դϴ�.");
			}
		};
		rc.turnOn(); //�͸�������ü
		rc.turnOff();
	}

}
