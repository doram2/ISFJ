package polymorphism;

public class BTest {

	public static void main(String[] args) {
		B b = new B();
		A a = b;
		a.method0();//���� ���Ÿ� ���� �ڽİ�ü�� ������ �ʿ� ����
					//Override ���� ������ �������� �ǹ̰� ����
	}

}
