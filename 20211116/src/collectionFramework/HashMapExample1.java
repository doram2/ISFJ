package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map 컬렉션
public class HashMapExample1 {
	public static void main(String[] args) {
		//딕셔너리 dic = {"a":1, "b":2}: Map
		//Collection: value만 존재
		List<String> list = new ArrayList<String>();
		list.add("김춘식");
		//Map: key, value 존재
		//Map 생성: Map<키, 값>
		Map<String, Integer> map = new HashMap<String, Integer>();
		//객체 저장
		map.put("김춘식", 1);
		map.put("김일이", 21);
		map.put("김이삼", 15);
		map.put("김삼사", 27);
		map.put("김사오", 20);
		map.put("김사오", 32); //중복key를 허용하지 않음
		System.out.println("map의 크기는 "+map.size());
		System.out.println("김춘식의 나이는 "+map.get("김춘식")+"세 입니다.");
		
		map.put("김춘식", 16); //존재하는 key면 값을 수정
		
		Set<String> keySet = map.keySet(); //키를 추출하면 Set 자료형으로 반환
		
		for(String s : keySet) {
			System.out.println(s+"의 나이는 "+map.get(s)+"세 입니다");
		}
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println("================================");
		map.remove("김춘식");
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
	}	
}
