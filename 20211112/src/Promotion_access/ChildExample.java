package Promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = new Parent();
		parent = child; 
		parent.method1();
		parent.method2(); //�ڽĿ��� �������̵��� �޼���� ��밡��
		//parent.method3(); �θ� �ڽ��� ������ ���, �ڽĿ� ���ǵ� �Լ��� ����� �� ����.
	}

}
