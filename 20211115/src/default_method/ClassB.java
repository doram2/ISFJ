package default_method;

public class ClassB extends ClassA {
	public void method03() {
		System.out.println("ClassB-method02");
	}
	
	@Override
	public void method01() { //�߻�޼ҵ�� ������ �������̵��ؾ���
		System.out.println("ClassB-method01");
	}
	//�Ϲݸ޼ҵ�� �������̵� ���� �ʾƵ� �ȴ�
}
