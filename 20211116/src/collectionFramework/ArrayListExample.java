package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//�迭�� ������ ũ�Ⱑ �Һ��� ���� ������ ����Ʈ�� ����
		String[] str = {"����","�ڹٰ�","�ʹ�","���ƿ�"};
		System.out.println(str.length);
		str[3] = "�����ƿ�";
		//str[4] = "."; 
		
		//����Ʈ�� ����. �迭�� ���� ���� Ÿ�Ը� ������ �� �ִ�.
		List list = new ArrayList(); 
		list.add("�����");
		list.add("������");
		list.add(1);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2)); //�̷��� ����ҰŸ� Ÿ�� �������� �ʾƵ� ��
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object obj : list) {
			System.out.println(obj); //object: Ÿ��x
		}
		
		List<String> list1 = new ArrayList<String>();
		list1.add("�����");
		list1.add("������");
		list1.add("1");
	
		for(String s : list1) {
			System.out.println(s);
		}
		
		int i = 10;
		Object obj1 = 10;
		String st = "�����";
		obj1 = "�����";
		double d = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		obj1 = new Calu();
		Calu calu = (Calu)obj1; //���� ����ȯ
		calu.setFirst(10);
		System.out.println(calu);
		
	}
}