package javacollections;

import java.util.ArrayDeque;

public class DqDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		System.out.println(dq);
		dq.clear();
		dq.addFirst(54);
		dq.addFirst(58);
		dq.addLast(24);
		dq.addLast(22);
		System.out.println(dq);
	}

}
