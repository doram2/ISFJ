
public abstract class Ex01 {
	int first; //멤버필드
	//생성자
	public Ex01(int first) {
		this.first = first;
	}//Ex01의 객체 생성을 못하니까 생성자가 필요없음
	//추상메소드: 정의되어 있지 않고 메소드명만 가지고 있는 메소드
	public abstract void method01();
	//일반메소드
	public void method02() {
		System.out.println("Ex01-method");
	}
}
