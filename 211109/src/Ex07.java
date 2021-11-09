
public class Ex07 {
	int first;
	int second;
	int result;
	//개발자가 생성자를 만들면(생성자가 존재하면) default 생성자는 자동으로 만들어지지 않는다.
	//생성자가 있는 경우 default 생성자는 명시적으로 만들어줘야 한다.
	public Ex07() { //default 생성자 그래서 여기서 만듦
		System.out.println("default 생성자 실행");
	}
	public Ex07(int first, int second) { //생성과 동시에 초기화
		this.first = first;
		this.second = second;
	}
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return result;
	}
	
	public void add() {
		this.result = this.first + this.second;
	}
	
	public void sub() {
		this.result = this.first - this.second;
	}
	
	
}
