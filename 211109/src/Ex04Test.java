
public class Ex04Test {
	
	public static void main(String[] agrs) {
		Ex04 ex04;
		ex04 = new Ex04();
		ex04.setData(25, 156.5, true, "�����");
		
		String name = ex04.name;
		
		Ex04 ex004;
		ex004 = new Ex04();
		ex004.setAge(35);
		ex004.setGender(false);
		ex004.setHeight(173.5);
		ex004.setName("������");
		
		name = ex004.getName();
		System.out.println(name);
		
		//��ü ���⿡���� �Ʒ�ó�� ����ϸ� �ȵȴ�.
		/*
		 * Ex04 ex041;
		 * ex041.age = 20;
		 * ex041.gender = true;
		 * ex041.height = 169.5;
		 * ex041.name = "���̻�";
		 */
		
	}
}
