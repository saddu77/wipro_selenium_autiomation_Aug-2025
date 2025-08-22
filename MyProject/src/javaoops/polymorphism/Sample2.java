package javaoops.polymorphism;
class Calculation1{
	void addition(int x,int y) {
		int res;
		res = x + y;
		System.out.println("sum is: " + res);
	}
	
	void addition(double x,double y) {
		double res;
		res = x + y;
		System.out.println("sum is: " + res);		
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation1 obj = new Calculation1();
		obj.addition(20.2, 10.3);
		obj.addition(40, 30);
	}

}
