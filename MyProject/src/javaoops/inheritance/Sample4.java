package javaoops.inheritance;
//Hybrid-Inheritance
class A4{
	double pi = 3.14;
}

class B4 extends A4{
	
	void area_of_circle() {
		double res;
		res = 2 * pi * 5;
		System.out.println( "Area of circle" + res);
	}
}

class C4 extends A4{
	 
	void surface_area_of_Sphere() {
		double res;
		res = 4 * pi * 5;
		System.out.println("Surface Area of Sphere:" + res);
	}
}

class D4 extends C4{
	
}
public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D4 obj = new D4();
//		obj.area_of_circle();
		obj.surface_area_of_Sphere();
	}

}
