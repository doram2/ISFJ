package default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1 = new MyclassA();
		mi1.method1();
		mi1.method2(); //default 메소드를 재정의하지 않음
		
		MyInterface mi2 = new MyclassB();
		mi2.method1();
		mi2.method2();
		
	

	}

}
