package javaexceptions;

public class Sample8 {
	 private static int divide(int a,int b) throws Exception{
		if(b == 0) {		
			throw new Exception("second argument cannot be zero..");
		}
		return a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =  3;
		int b = 0;
		try {
			System.out.println("Result: " + divide(a,b));
		}catch(Exception ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
