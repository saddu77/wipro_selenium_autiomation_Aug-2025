package javaoops.inheritance;
//Hierarchical Inheritance
class A3{
	String shape;	
}

class B3 extends A3{
	void circle() {
		shape = "circle";
		System.out.println("Shape is : " + shape);
	}	
}

class C3 extends A3{
	void square() {
		shape = "square";
		System.out.println("Shape is : " + shape);
	}	
}

class D3 extends A3{	
	void rect() {
		shape = "rect";
		System.out.println("Shape is: " + shape);
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 objC = new B3();
		objC.circle();
		
		C3 objS = new C3();
		objS.square();

		D3 objR = new D3();
		objR.rect();		
	}
}
