package interface_extends;

public class ImplementationC implements InterfaceC{
//InterfaceC가 InterfaceA와 InterfaceB를 상속받기때문에 C만 상속받아도 된다
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
		
	}

}
