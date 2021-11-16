package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("�����"); //������ ������ ���� �ʴ´�.
		set.add("������");
		set.add("���̻�");
		set.add("����");
		set.add("����");
		
		int size = set.size(); //���� ���� �ݿ����� �ʴ´�.
		System.out.println(size);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			String s = (String)iterator.next();
			System.out.println(s);
		}
		
		set.remove("�����");
		System.out.println(set.size());
		
		for(String s : set) {
			System.out.println(s);
		}
	}

}
