package interface_declaration;

public class RemoteControlNoNameExample {
	
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("CD를 켭니다.");	
			}
	
			@Override
			public void turnOff() {
				System.out.println("CD를 끕니다.");
				
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
				System.out.println("현재 cd볼륨은 "+vol+" 입니다.");
			}
		};
		rc.turnOn(); //익명구현객체
		rc.turnOff();
	}

}
