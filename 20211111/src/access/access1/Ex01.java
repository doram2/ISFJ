package access.access1;

public class Ex01 {
	//����ʵ忡 ���� �����ڸ� ���� ������ �⺻������ default
	//default ���� ������: ���� ��Ű�� �������� ��� ����. �ٸ� ��Ű�������� ��� �Ұ���
	//�ٸ� ��Ű���� �ִ� Ŭ�������� ������� ���Ѵ�.
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
