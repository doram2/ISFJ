
public class Ex07 {
	int first;
	int second;
	int result;
	//�����ڰ� �����ڸ� �����(�����ڰ� �����ϸ�) default �����ڴ� �ڵ����� ��������� �ʴ´�.
	//�����ڰ� �ִ� ��� default �����ڴ� ��������� �������� �Ѵ�.
	public Ex07() { //default ������ �׷��� ���⼭ ����
		System.out.println("default ������ ����");
	}
	public Ex07(int first, int second) { //������ ���ÿ� �ʱ�ȭ
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
