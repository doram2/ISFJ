package finalTest;

public class Ex02 extends Ex01{
	public int sub() {
		return first - second;
	}
	public int mul() {
		return first * second;
	}
	
	/*
	@Override
	public int div() { 
		if(second == 0) {
			return 0;
		}
		else {
			return first / second;
		}
	} final 메서드는 재정의 불가능
	*/
	
}
