package javaoops.interfce;

interface MicroPhone{
	void volume();
}

public class Sample4 {
	//creating an Object to a interface through AIC
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicroPhone obj = new MicroPhone() {			
			@Override
			public void volume() {
				// TODO Auto-generated method stub
				System.out.println("volume is high !!");
			}
		};
		obj.volume();
	}

}
