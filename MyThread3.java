package mulitiTherading;

public class MyThread3 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		
		String threadName = t1.getName();
		Thread.currentThread().setName("shivendra");
		System.out.println("name of current thread :"+Thread.currentThread().getName());
		
		int priority = t1.getPriority();
		System.out.println("priority of thread :"+priority);
		
		Thread.State state= t1.getState();
		System.out.println("state of thread :"+state);
	}
}
