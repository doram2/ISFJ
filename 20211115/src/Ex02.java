
public class Ex02 extends Ex01{
	//�θ�Ŭ������ �����ڰ� ������, �ڽ�Ŭ������ �θ�Ŭ�������� �������ִ� �����ڰ� �����ؾ� ��
	public Ex02(int first) {
		super(first);
	}

	public void method2() {
		//�߻�޼ҵ尡 �ִ� Ŭ������ ��ü�� ������ �� ����.
		//Ex01 ex01 = new Ex01();
	}
	
	//�߻�޼ҵ尡 �ִ� �߻�Ŭ������ ����ϸ� �߻�޼ҵ�� �������̵��� �ؾ���
	@Override
	public void method01() {
		System.out.println("Ex02-method");
	}
}
