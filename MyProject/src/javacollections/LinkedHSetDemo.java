package javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Alex");
		lhs.add("Bob");
		lhs.add("Alex");
		lhs.add("Clare");
		lhs.add("Daniel");		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
