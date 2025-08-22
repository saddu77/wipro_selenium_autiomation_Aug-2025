package javacollections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i <= 5; i++) {
			al.add(i);
		}
		
		System.out.println(al);
		
		al.remove(3);
		
		System.out.println(al);
		
		for(int i=0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}		
	}
}
