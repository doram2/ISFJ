package polymorphism;

public class BTest {

	public static void main(String[] args) {
		B b = new B();
		A a = b;
		a.method0();//내꺼 쓸거면 굳이 자식객체를 대입할 필요 없음
					//Override 하지 않으면 다형성의 의미가 없음
	}

}
