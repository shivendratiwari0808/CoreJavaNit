package mulitiTherading;
class MyRunnable implements Runnable
{
	public void run() {
		System.out.println("run () in myRunnable");
	}
}
class MyThread22 extends Thread{
	MyThread22(){
		super();
	}
	MyThread22(Runnable target){
		super(target);
	}
	@Override
	public void run() {
		System.out.println("mythread3 run()");
		super.run();
	}
}
public class TestExecution {

	public static void main(String[] args) {
		Thread th1 = new Thread();
		th1.start();

	}

}
