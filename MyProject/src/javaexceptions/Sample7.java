package javaexceptions;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		int div = 1;
		try {
			System.out.println(num/0);
		}catch(Exception ex) {
			System.out.println("Exception Occured !!!");
		}finally {
			System.out.println("Finally block executed !!!");
		}
	}

}
