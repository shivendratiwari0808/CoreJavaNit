package mulitiTherading;
class Sample extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(i+" custom Thread");
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Thread t1 = new Thread();
		t1.start();
		for(int i=1;i<=10;i++) {
			System.out.println(i+" main ");
		}
		s1.start();
	}

}
