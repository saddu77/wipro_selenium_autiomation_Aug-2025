package javacollections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("Alex");
		stack.push("Bob");
		stack.push("Clare");
		stack.push("Daniel");
		stack.push("Emily");
		
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		stack.pop();
		System.out.println("--------------------");
		itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}		
	}
}
