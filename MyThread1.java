package mulitiTherading;
class T extends Thread{
	@Override
	public void run() {
		System.out.println("inside run");
		System.out.println(Thread.currentThread().getState());
		System.out.println("run completed..");
	}
}
public class MyThread1 {
	public static void main(String[] args) {
		Thread t1= Thread.currentThread();
		System.out.println("main thread state :"+t1.getState());
		T t=new T();
		System.out.println("custom thread state :"+t.getState());
		t.start();
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e){ }
		System.out.println("main thread state :"+t1.getState());
		System.out.println("main ends");
		System.out.println("custom threads state :"+t1.getState());
	}
}
