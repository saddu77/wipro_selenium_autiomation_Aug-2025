package javathreads;

class Task extends Thread{
	private Thread t;
	private String tName;
	
	Task(String name){
		tName = name;
		System.out.println("Creating " + tName);
	}
	
	public void run(){
		System.out.println("Running " + tName);
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("Thread: " + tName + i);
				Thread.sleep(50);
			}
		}catch(InterruptedException ex) {
			System.out.println("Thread " + tName + " interrupted.");
		}
		System.out.println("Thread " + tName + " exiting.");
	}
}


public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1 = new Task("Thread-1");
		t1.start();
		
		Task t2 = new Task("Thread-2");
		t2.start();	
	}
}
