package javacollections;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int     float byte
		//Integer Float Byte
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		pQ.add(10);
		pQ.add(20);
		pQ.add(15);
		//printing top element of Priority Queue
		System.out.println(pQ.peek());
		
		//printing and removing the top element of Priority Queue
		System.out.println(pQ.poll());
		System.out.println(pQ.peek());	
	}
}
