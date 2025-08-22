package javaloops;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum of natural numbers from 1 to 1000
		int sum = 0;
		int n = 1000;
		for(int i = 1; i <= n; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println("Sum = " + sum);
	}

}
