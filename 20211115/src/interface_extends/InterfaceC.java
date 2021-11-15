package interface_extends;

//인터페이스가 인터페이스를 상속할 땐 extends. 다중상속가능
public interface InterfaceC extends InterfaceA, InterfaceB {
	public void methodC();
}
