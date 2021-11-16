package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("±èÃá½Ä", 1);
		map1.get("±èÃá½Ä");
		Map<Integer, Double> map2 = new HashMap<Integer, Double>();
		map2.put(1, 10.5);
		double d = map2.get(1);
		System.out.println(d);
		
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("±èÃá½Ä", new Member("±èÃá½Ä",30));
		map.put("±èÀÏÀÌ", new Member("±èÃá½Ä",22));
		map.put("±èÀÌ»ï", new Member("±èÃá½Ä",27));
		map.put("±è»ï»ç", new Member("±èÃá½Ä",16));
		
	}

}
