
public interface Ex03 {
	//�������̽��� �⺻������ ���, �߻�޼ҵ带 ����
	static final int FIRST = 10;
	
	public void method01(); 
	
	//�߻�޼ҵ带 �����ϱ� ��ü ���� �Ұ� -> �����ڸ� ���� �ʿ� ����
	//�Ϲݸ޼ҵ�, ����ʵ� ����
	//�޼ҵ尡 �ϴ� ������ �ܺηκ��� ����ʵ忡 ���� ���޹ްų� ����ʵ忡 �ִ� ���� �ܺο� �����ϱ� ���� ��� (setter, getter)
	
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
	//default, static method�� ����� �� �ֱ� �ѵ� ���� ���� ���ȭ�� �ȵ�
}
