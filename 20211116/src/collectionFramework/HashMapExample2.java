package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("�����", 1);
		map1.get("�����");
		Map<Integer, Double> map2 = new HashMap<Integer, Double>();
		map2.put(1, 10.5);
		double d = map2.get(1);
		System.out.println(d);
		
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("�����", new Member("�����",30));
		map.put("������", new Member("�����",22));
		map.put("���̻�", new Member("�����",27));
		map.put("����", new Member("�����",16));
		
	}

}
