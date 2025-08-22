package javacollections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vObj = new Vector<Integer>();
		for(int i=1; i <=5; i++)
			vObj.add(i);
		System.out.println(vObj);
		vObj.remove(3);
		System.out.println(vObj);
		
		for(int i=0; i < vObj.size(); i++) {
			System.out.print(vObj.get(i) + " ");
		}
	}
}
