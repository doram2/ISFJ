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
		parent.method2(); //자식에서 오버라이딩된 메서드는 사용가능
		//parent.method3(); 부모가 자식을 참조할 경우, 자식에 정의된 함수는 사용할 수 없다.
	}

}
