package javarrays;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {80,50,70,77,82,55};
		System.out.println( "Length :" + marks.length);
		System.out.println(marks[2]);
		
		System.out.println("---------");
		
		// displaying all elements of an Array 
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("-----------");
		//For each loop
		for (int i : marks) {
			System.out.println(i);
		}
	}
}
