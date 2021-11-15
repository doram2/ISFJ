package runtime_exception;

public class MultiExceptionExample {

	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;	
		try {
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data1 / data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է°��� 2�� �ʿ��մϴ�.");
		}catch(ArithmeticException e) { //catch �ؿ� �̾���� �� ����
			if(data2 == 0) {
				System.out.println(0);
			}
			else {
				System.out.println(data1 / data2);
			}
		}
	}

}
