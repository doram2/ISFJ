
public class Ex03Test {

	public static void main(String[] args) {
		System.out.println(Ex03.name);
		Ex03.name = "������";
		System.out.println(Ex03.name);
		//final ������ ��ü���� ���� �ʱ�ȭ �� �� �ִ�. ��, �� �� �ʱ�ȭ�� �ϸ� ���� �� �� ����.
		Ex03 ex03 = new Ex03(20, 30);
		Ex03 ex031 = new Ex03(50, 20);
		System.out.println(ex03.getVal1());
		System.out.println(ex031.getVal1());
		
		//����� ����ϴ� ������ ��� ��ü���� ������� �ʴ� ������ ���� ����ϱ� ����
		System.out.println("=======");
		System.out.println(Ex03.first);
		System.out.println(Ex03.second);
		System.out.println(ex03.first);
		System.out.println(ex03.second);
		System.out.println(ex031.first);
		System.out.println(ex031.second);
		
	}

}
