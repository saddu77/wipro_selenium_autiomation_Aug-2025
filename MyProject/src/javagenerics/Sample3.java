package javagenerics;

import java.util.ArrayList;
//ArrayList without Generics
public class Sample3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Alex");
		al.add("Bob");
		al.add(30);
		
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		String s3 = (String) al.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);			
	}
}
