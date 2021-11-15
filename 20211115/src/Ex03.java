
public interface Ex03 {
	//인터페이스는 기본적으로 상수, 추상메소드를 가짐
	static final int FIRST = 10;
	
	public void method01(); 
	
	//추상메소드를 가지니까 객체 생성 불가 -> 생성자를 가질 필요 없음
	//일반메소드, 멤버필드 없음
	//메소드가 하는 역할은 외부로부터 멤버필드에 값을 전달받거나 멤버필드에 있는 값을 외부에 전달하기 위해 사용 (setter, getter)
	
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
	//default, static method를 사용할 수 있긴 한데 아직 글케 상용화는 안됨
}
