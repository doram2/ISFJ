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
			System.out.println("입력값이 2개 필요합니다.");
		}catch(ArithmeticException e) { //catch 밑에 이어붙일 수 있음
			if(data2 == 0) {
				System.out.println(0);
			}
			else {
				System.out.println(data1 / data2);
			}
		}
	}

}
