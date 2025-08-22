package javastrings;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		// In Java Strings are immutable(not changeable)
		s1 = s1.concat(s2);
		System.out.println(s1);
	}

}
