package runtime_exception;

public class ClassNotFountException {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List");
			System.out.println("클래스가 있습니다.");
		} catch (ClassNotFoundException e) /*자료형, 변수*/{
			e.printStackTrace();//어떤오류인지 확인하기 위한 코드
			System.out.println("클래스가 없습니다.");
		}
		System.out.println("프로그램 끝");
	}

}
