package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("김춘식"); //object type
		list.add("김일이");
		list.add("김일이");
		list.add("김일이"); //중복값 저장 가능
		list.add("김이삼");
		list.set(3, "김육칠"); //리스트 수정
		for(int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list.get(i));//Integer 배열이므로 형변환필요 x
		}
		
		//리스트 값 삭제
		list1.remove(0);
		System.out.println(list1.size());
		
		System.out.println("==================================");
		System.out.println(list.size());
		for(Object obj : list) {
			String s = (String)obj;
			System.out.println(s); //obj로 바로 출력해도 되는데 이게 일반적
		}
		list.remove(0);
		System.out.println(list.size());
		
		list.remove("김일이");
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("김춘식");
		System.out.println(list.isEmpty());
		//list method: add, remove, size, isEmpty, removeAll
	}

}
