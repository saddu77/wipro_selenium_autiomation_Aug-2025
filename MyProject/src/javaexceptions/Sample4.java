package javaexceptions;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		System.out.println("begin");
		try {
			System.out.println(name.length());
		}catch(NullPointerException ex) {
			System.out.println("Excepion arised !!");
		}
		
		System.out.println("end");
		
	}

}
