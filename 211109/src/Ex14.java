
public class Ex14 {
	
	int result;
	int first;
	int second;
	int add; //��ȣ������ ������ ���
	
	public Ex14(int first, int second) {
		this.first = first; //�Ϲ������� �Ű������� ����ʵ��� �̸��� �����ϱ� ������ ������ ���� this�� ����Ѵ�. ==> �Ϲ������� ����ʵ忡�� ��� this.�� �ٿ� ���
		this.second = second;
	}
	//�޼����� 4���� ����
	//1. �Է°��� ������� ��� �ִ� �޼���
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int div(int num1, int num2){
		return num1 / num2; 
	}
	//2. �Է°��� �ְ� ������� ���� �޼���
	public void sub(double num1, int num2) {
		this.result = (int)num1 - num2; //result���� this.�� �Ⱥٿ��� �Ǳ� �ѵ� �����ϸ� ���̴°� ���� �ֳĸ� ����ʵ�ϱ�
		System.out.println(result);
	}
	public int sub(int num1, double num2) { //�޼��� �����ε� - �Ű������� ������ �ٸ�
		return (int) (num1 - num2);
	}
	//3. �Է°��� ���� ������� �ִ� �޼���
	public int mul() {
		return this.first * this.second; //���ο��� ������ �� this ���� ����
	}
	//4. �Է°��� ������� ��� ���� �޼���
	public void div() { //�޼��� �����ε�
		this.result = this.first / this.second;
		System.out.println(result);
	}
}
