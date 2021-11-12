
public class Ex03 {
	//���� ����: ��� ��ü�� ���� �����ؼ� ����ϱ� ���� ���� ��
	//���� ���� �ʱ�ȭ: static ���� �̿�
	static String name;
	
	//���(static final):
	static final int first;
	static final int second;
	
	//final ����: ��ü���� ������ ���� ���� �� �ִ�. �����ڸ� �̿��Ͽ� �ʱ�ȭ
	final int val1;
	final int val2;
	
	static {
		name = "�����";
		first = 10;
		second = 5;
	}
	
	public Ex03(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public static String getName() {
		return name;
	}

	public static int getFirst() {
		return first;
	}

	public static int getSecond() {
		return second;
	}

	public int getVal1() {
		return val1;
	}

	public int getVal2() {
		return val2;
	}
}