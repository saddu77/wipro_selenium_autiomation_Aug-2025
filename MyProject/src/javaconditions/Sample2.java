package javaconditions;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage = 101;
		if( percentage >= 85 && percentage <= 100) {
			System.out.println("FCD !!!");
		}else if(percentage >= 60 && percentage < 85) {
			System.out.println("First Class");
		}else if(percentage >= 35 && percentage < 60) {
			System.out.println("Pass Class");
		}else if(percentage >= 0 && percentage < 35) {
			System.out.println("Fail !!!");
		}else {
			System.out.println("Enter percentage between 1 and 100");
		}
	}
}
