package javathreads;

public class SampleThread extends Thread {
	
//	By extending Thread Class
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread obj = new SampleThread();
		obj.start();
	}

}
