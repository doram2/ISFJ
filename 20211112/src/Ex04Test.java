
public class Ex04Test {

	public static void main(String[] args) {
		B b = new B(); // A
		C c = new C(); // A
		D d = new D(); // B, A
		E e = new E(); // C, A
		//������: �θ�� �ڽ� ��ü�� ������ �� �ִ�.
		A a = b; // a�� b����
		a = c; // a�� c����
		a = d;
		a = e; //�ϳ��� ������ �������� ��ü ��밡�� -> ������
	}

}
