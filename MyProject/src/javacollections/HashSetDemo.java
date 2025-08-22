package javacollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Alex");
		hs.add("Bob");
		hs.add("Clare");
		hs.add("Daniel");
		hs.add("Alex");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
