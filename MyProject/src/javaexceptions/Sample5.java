package javaexceptions;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = {55,60,85,75,45,90};
		System.out.println("begin");
		try {
			System.out.println(marks[6]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException occured !!!");
		}
		System.out.println("end");
		
	}
}
