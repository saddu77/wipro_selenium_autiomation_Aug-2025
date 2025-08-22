package javaoops.inheritance;

class A2{
	int x = 10;
}

class B2 extends A2{
	int y= 20;
}

class C2 extends B2{
	int z = 30;
	void add() {
		int res;
		res = x + y + z;
		System.out.println("Sum is: " + res);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj = new C2();
		obj.add();
	}

}
