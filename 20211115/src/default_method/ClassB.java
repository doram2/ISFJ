package default_method;

public class ClassB extends ClassA {
	public void method03() {
		System.out.println("ClassB-method02");
	}
	
	@Override
	public void method01() { //추상메소드는 무조건 오버라이딩해야함
		System.out.println("ClassB-method01");
	}
	//일반메소드는 오버라이딩 하지 않아도 된다
}
