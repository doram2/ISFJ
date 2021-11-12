package finalTest;

public class Ex01 {
	int first;
	int second;
	
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int add() {
		return first + second;
	}
	public final int div() {
		return first / second;
	}
}
