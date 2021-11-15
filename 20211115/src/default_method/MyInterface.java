package default_method;

public interface MyInterface {
	public void method1(); //오버라이딩 필요
	
	//오버라이드 할 수 있고 안 할 수도 있음
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
