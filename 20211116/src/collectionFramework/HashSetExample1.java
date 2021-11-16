package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("±èÃá½Ä"); //¼ø¼­¿¡ ¿µÇâÀ» ¹ŞÁö ¾Ê´Â´Ù.
		set.add("±èÀÏÀÌ");
		set.add("±èÀÌ»ï");
		set.add("±è»ï»ç");
		set.add("±è»ï»ç");
		
		int size = set.size(); //°°Àº °ªÀº ¹İ¿µµÇÁö ¾Ê´Â´Ù.
		System.out.println(size);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			String s = (String)iterator.next();
			System.out.println(s);
		}
		
		set.remove("±èÃá½Ä");
		System.out.println(set.size());
		
		for(String s : set) {
			System.out.println(s);
		}
	}

}
