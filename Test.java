package mulitiTherading;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("run executed for thread name :"+getName());
		}
	}
}
public class Test {
	public static void main(String[] args) {
		A a11=new A();
		System.out.println("Priority of 1st custom thread :"+a11.getPriority());
		a11.setPriority(1);
		
		System.out.println("Priority of 1st custom thread :"+a11.getPriority());
		System.out.println("name of thread custom thread 1 :"+a11.getName());
		
		A a10 = new A();
		System.out.println("Priorty of 2nd custom thread :"+a10.getPriority());
		a10.setPriority(1);
		System.out.println("priority of 2nd custom thread :"+a10.getPriority());
		System.out.println("name of thread custom thread 1:"+a10.getName());
		
		A a9 = new A();
		System.out.println("Priority of 3rd custom thread :"+a9.getPriority());
		a9.setPriority(7);
		System.out.println("priority of 3rd custom thread :"+a9.getPriority());
		System.out.println("name of thread custom thread 3 :"+a9.getName());
		
		a11.start();
		a10.start();
		a9.start();
	}

	
}
