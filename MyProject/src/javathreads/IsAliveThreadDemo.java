package javathreads;

public class IsAliveThreadDemo extends Thread{

	public void run() {
		System.out.println("Thread is running: ");
		try {
			Thread.sleep(300);
		}catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Thread execution done: ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAliveThreadDemo tobj1 = new IsAliveThreadDemo();
		IsAliveThreadDemo tobj2 = new IsAliveThreadDemo();
		tobj1.start();
		tobj2.start();		
		System.out.println(tobj1.isAlive());
		System.out.println(tobj2.isAlive());
		
	}
}
