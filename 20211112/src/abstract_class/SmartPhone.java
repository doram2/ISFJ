package abstract_class;

public class SmartPhone extends Phone {//�ڽ�Ŭ���� abstract ��� �Ұ�
	//�߻� Ŭ������ ��ӹ����� �߻� �޼��带 �������Ͽ� ����Ѵ�.
	
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("������ �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������ ���ϴ�");		
	}

}
