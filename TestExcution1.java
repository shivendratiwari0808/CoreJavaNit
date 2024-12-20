package mulitiTherading;

public class TestExcution1 {
class Mythread44 extends Thread{
	@Override
	public void run() {
		System.out.println("my thread4 is run ");
	}
}
	public static void main(String[] args) {
		Mythread44 mt = new Mythread44();
		mt.start();
	}

}
