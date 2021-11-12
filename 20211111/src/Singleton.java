
public class Singleton {
	int first;
	int second;
	static int val = 10;
	//자기 자신의 객체를 미리 만들어 놓고 사용
	private static Singleton singleton = new Singleton();
//	private static 	클래스명	 singleton = new 클래스명(); 
	private Singleton() {} //private접근자를 가진 클래스 필요
	public static Singleton getInstance() { //객체 반환 메서드. 자신의 객체를 전달
		return singleton;
	}
}
