
public class Ex02Test {

	public static void main(String[] args) {
		int i = 10;
		//cal = calculator()
		Ex02 ex02 = new Ex02();
	//  �ڷ���	 ������
		ex02.addr = "��õ��";
		ex02.age = 25;
		ex02.name = "�����";
		ex02.gender = true;
		System.out.println(ex02.addr);
		System.out.println(ex02.age);
		System.out.println(ex02.name);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "��õ��";
		ex021.age = 26;
		ex021.name = "������";
		ex021.gender = false;
		System.out.println(ex021.addr);
		System.out.println(ex021.age);
		System.out.println(ex021.name);
		System.out.println(ex021.gender);
		
		
	}

}
