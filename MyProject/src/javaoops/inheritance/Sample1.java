package javaoops.inheritance;

//Parent class
class A{
	int number1 = 10;
}

//Child class
class B extends A{
	int number2 = 20;
	int result;
	void addition() {
		result = number1 + number2;
		System.out.println("Result is: " + result);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.addition();
	}

}
