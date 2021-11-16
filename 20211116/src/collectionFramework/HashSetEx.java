package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("È«±æµ¿",30));
		set.add(new Member("±èÃá½Ä",12));

		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member m = iterator.next();
			if(m.getName().equals("±èÃá½Ä")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());
		
		for(Member m : set) {
			if(m.getName().equals("È«±æµ¿")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());

		set.clear(); //set ÃÊ±âÈ­
		System.out.println(set.isEmpty());
	}

}
