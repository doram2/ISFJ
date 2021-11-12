package interface_declaration;

public interface RemoteControl {//������x, �ʵ�x, �Ϲ� �޼ҵ�x, ������x
								//����� �߻�޼ҵ�θ� ����
	
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//Java8 ���� �߰� - default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���� �Ѵ�.");
		}
		else {
			System.out.println("���� ������ �Ѵ�.");
		}
	}
	
	//static method
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
