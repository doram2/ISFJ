package access.access1;

public class Ex01 {
	//멤버필드에 접근 지정자를 주지 않으면 기본적으로 default
	//default 접근 지정자: 같은 패키지 내에서만 상속 가능. 다른 패키지에서는 상속 불가능
	//다른 패키지에 있는 클래스에서 사용하지 못한다.
	int first;
	int second;
	int result;
	
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public int getResult() {
		return result;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
	
}
