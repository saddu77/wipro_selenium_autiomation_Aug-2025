package javawrapperclass;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte data type
		byte a = 1;
		Byte bObj = Byte.valueOf(a);
		
		int b = 10;
		Integer intObj = Integer.valueOf(b);
		
		float c = 16.6f;
		Float floatObj = Float.valueOf(c);
		
		double d = 250.5;
		Double doubleObj = Double.valueOf(d);
		
		char e = 'a';
		Character charObj = e;
		
		System.out.println("Printing as objects");
		System.out.println(bObj);
		System.out.println(intObj);
		System.out.println(floatObj);
		System.out.println(doubleObj);
		System.out.println(charObj);
		
		byte bv = bObj;
		int iv = intObj;
		float fv = floatObj;
		double dv = doubleObj;
		char cv = charObj;
		
		System.out.println("Printing as data types");
		System.out.println(bv);
		System.out.println(iv);
		System.out.println(fv);
		System.out.println(dv);
		System.out.println(cv);
		
	}

}
