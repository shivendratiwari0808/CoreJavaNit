package mulitiTherading;

public class MyThread2 {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		String name=thread.getName();
		
		int priority = thread.getPriority();
		
		Thread.State state= thread.getState();
		
		System.out.println("name :"+name);
		System.out.println("priority :"+priority);
		System.out.println("state :"+state);
	}
}
