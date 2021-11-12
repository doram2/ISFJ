
public class Ex04Test {

	public static void main(String[] args) {
		B b = new B(); // A
		C c = new C(); // A
		D d = new D(); // B, A
		E e = new E(); // C, A
		//다형성: 부모는 자식 객체를 참조할 수 있다.
		A a = b; // a가 b가됨
		a = c; // a가 c가됨
		a = d;
		a = e; //하나의 변수로 여러개의 객체 사용가능 -> 다형성
	}

}
