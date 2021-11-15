
public class Ex02 extends Ex01{
	//부모클래스에 생성자가 있으면, 자식클래스에 부모클래스에게 전달해주는 생성자가 존재해야 함
	public Ex02(int first) {
		super(first);
	}

	public void method2() {
		//추상메소드가 있는 클래스는 객체를 생성할 수 없다.
		//Ex01 ex01 = new Ex01();
	}
	
	//추상메소드가 있는 추상클래스를 상속하면 추상메소드는 오버라이딩을 해야함
	@Override
	public void method01() {
		System.out.println("Ex02-method");
	}
}
