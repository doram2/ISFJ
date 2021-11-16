package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�����"); //object type
		list.add("������");
		list.add("������");
		list.add("������"); //�ߺ��� ���� ����
		list.add("���̻�");
		list.set(3, "����ĥ"); //����Ʈ ����
		for(int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list.get(i));//Integer �迭�̹Ƿ� ����ȯ�ʿ� x
		}
		
		//����Ʈ �� ����
		list1.remove(0);
		System.out.println(list1.size());
		
		System.out.println("==================================");
		System.out.println(list.size());
		for(Object obj : list) {
			String s = (String)obj;
			System.out.println(s); //obj�� �ٷ� ����ص� �Ǵµ� �̰� �Ϲ���
		}
		list.remove(0);
		System.out.println(list.size());
		
		list.remove("������");
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("�����");
		System.out.println(list.isEmpty());
		//list method: add, remove, size, isEmpty, removeAll
	}

}
