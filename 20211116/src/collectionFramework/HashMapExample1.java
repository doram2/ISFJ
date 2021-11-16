package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map �÷���
public class HashMapExample1 {
	public static void main(String[] args) {
		//��ųʸ� dic = {"a":1, "b":2}: Map
		//Collection: value�� ����
		List<String> list = new ArrayList<String>();
		list.add("�����");
		//Map: key, value ����
		//Map ����: Map<Ű, ��>
		Map<String, Integer> map = new HashMap<String, Integer>();
		//��ü ����
		map.put("�����", 1);
		map.put("������", 21);
		map.put("���̻�", 15);
		map.put("����", 27);
		map.put("����", 20);
		map.put("����", 32); //�ߺ�key�� ������� ����
		System.out.println("map�� ũ��� "+map.size());
		System.out.println("������� ���̴� "+map.get("�����")+"�� �Դϴ�.");
		
		map.put("�����", 16); //�����ϴ� key�� ���� ����
		
		Set<String> keySet = map.keySet(); //Ű�� �����ϸ� Set �ڷ������� ��ȯ
		
		for(String s : keySet) {
			System.out.println(s+"�� ���̴� "+map.get(s)+"�� �Դϴ�");
		}
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println("================================");
		map.remove("�����");
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
	}	
}
