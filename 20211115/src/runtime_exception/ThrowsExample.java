package runtime_exception;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			test();
		}catch(ArithmeticException e) {
			System.out.println(0);
		}
	}
	public static void test() throws ArithmeticException /*���ܸ� ȣ���Լ��� ������*/{
		int i = 2;
		int j = 0;
		
		System.out.println(i / j);
		
	}
}
