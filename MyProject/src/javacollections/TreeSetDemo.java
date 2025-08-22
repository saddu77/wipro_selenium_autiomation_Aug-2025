package javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Alex");
		ts.add("Clare");
		ts.add("Bob");		
		ts.add("Daniel");		
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
