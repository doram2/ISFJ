package interface_extends;

public class ImplementationC implements InterfaceC{
//InterfaceC�� InterfaceA�� InterfaceB�� ��ӹޱ⶧���� C�� ��ӹ޾Ƶ� �ȴ�
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() ����");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() ����");
		
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() ����");
		
	}

}