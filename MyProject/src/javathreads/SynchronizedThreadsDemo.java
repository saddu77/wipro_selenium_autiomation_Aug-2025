package javathreads;
// without Thread synchronization  
class PrintDemo{
	public void printCount() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Counter: " + i);
			}
		}catch(Exception ex) {
			System.out.println("Thread Interrupted...");
		}
	}
}
class Task2 extends Thread{
	private Thread t;
	private String threadName;
	PrintDemo PD;
	
	Task2(String threadName,PrintDemo PD){
		this.threadName = threadName;
		this.PD = PD;
	}
	
	public void run() {
		synchronized (PD) {
			PD.printCount();
		}
		
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start() {
		System.out.println("Starting...  " + threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class SynchronizedThreadsDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDemo PD = new PrintDemo();
		
		Task2 t1 = new Task2("Thread - 1", PD);
		Task2 t2 = new Task2("Thread - 2", PD);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception ex) {
			System.out.println("Interupted...");
		}
	}

}
