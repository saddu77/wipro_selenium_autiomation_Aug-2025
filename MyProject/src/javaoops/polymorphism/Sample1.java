package javaoops.polymorphism;
// Polymorphism by Function Overloading
class Calculation {
	void addition(int x,int y) {
		int res;
		res = x + y;
		System.out.println("sum is: " + res);
	}
	void addition(int x,int y,int z) {
		int res;
		res =  x + y + z;
		System.out.println("sum is: " + res);
	}
}
public class Sample1 {
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		obj.addition(30, 20, 10);
		obj.addition(40, 40);
	}
}
