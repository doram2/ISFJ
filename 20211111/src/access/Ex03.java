package access;

import access.access1.Ex04;
//protected 멤버는 다른 패키지에서 상속이 된다.
//default 멤버는 다른 패키지에서 상속 x
public class Ex03 extends Ex04{
	public void sub() {
		result = first - second;
	}
	public void div() {
		result = first / second;
	}
	
}
