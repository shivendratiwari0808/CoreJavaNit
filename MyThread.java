package mulitiTherading;

public class MyThread extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		System.out.println("before starting thread :"+thread.isAlive());
		
		thread.start();
		System.out.println("after starting thread :"+thread.isAlive());
		
		try {
			thread.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after thread is done :"+thread.isAlive());
	}

}
