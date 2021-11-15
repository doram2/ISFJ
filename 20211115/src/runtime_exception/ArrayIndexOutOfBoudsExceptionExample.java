package runtime_exception;//실행중에 발생하는 오류

public class ArrayIndexOutOfBoudsExceptionExample {
	public static void main(String[] args) {
		//args 인자값때문에 발생하는 오류: Runtime Exception
		//String[] args = {"1","2"}
		//					0	1
		//String[] args = {"1","2","3"}
		//String[] args = {"1","2","3","4"}
		/*					0   1   2   3
		try {
		String data1 = args[0];
		String data2 = args[1];
		String data3 = args[2];
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 3개 필요합니다.");
		}
		*/
		
		if(args.length == 3) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		}
		else {
			System.out.println("입력값이 3개 필요합니다.");
		}
		
		//인자를 2개만 줬는데 3번째 인덱스를 호출하니까 배열 크기를 넘어서서 오류발생
	}
}
