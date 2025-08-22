package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Zoe");
		al.add("Clare");
		al.add("Toni");
		al.add("Alen");
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
