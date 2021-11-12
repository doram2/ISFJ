package abstract_class;

public class SmartPhone extends Phone {//자식클래스 abstract 사용 불가
	//추상 클래스를 상속받으면 추상 메서드를 재정의하여 사용한다.
	
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");		
	}

}
