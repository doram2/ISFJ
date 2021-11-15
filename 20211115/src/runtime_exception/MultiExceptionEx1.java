package runtime_exception;

public class MultiExceptionEx1 {
	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;	
		try {
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data1 / data2);
		}catch(Exception e) {
			System.out.println("입력값이 2개 필요합니다.");
			if(data2 == 0) {
				System.out.println(0);
			}
			else {
				System.out.println(data1 / data2);
			}
		}
	}
}
