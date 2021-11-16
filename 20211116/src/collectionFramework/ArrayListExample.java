package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//배열의 단점인 크기가 불변인 것을 보완해 리스트를 만듦
		String[] str = {"나는","자바가","너무","좋아요"};
		System.out.println(str.length);
		str[3] = "참좋아요";
		//str[4] = "."; 
		
		//리스트는 가변. 배열과 같이 같은 타입만 저장할 수 있다.
		List list = new ArrayList(); 
		list.add("김춘식");
		list.add("김일이");
		list.add(1);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2)); //이렇게 사용할거면 타입 지정하지 않아도 됨
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object obj : list) {
			System.out.println(obj); //object: 타입x
		}
		
		List<String> list1 = new ArrayList<String>();
		list1.add("김춘식");
		list1.add("김일이");
		list1.add("1");
	
		for(String s : list1) {
			System.out.println(s);
		}
		
		int i = 10;
		Object obj1 = 10;
		String st = "김춘식";
		obj1 = "김춘식";
		double d = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		obj1 = new Calu();
		Calu calu = (Calu)obj1; //강제 형변환
		calu.setFirst(10);
		System.out.println(calu);
		
	}
}