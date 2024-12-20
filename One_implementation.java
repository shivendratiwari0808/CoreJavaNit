package batch_35;
interface I1{
	public void m1();
}
interface I2{
	public void m2();
}
class C1 implements I1,I2{
	@Override
	public void m1() {
		System.out.println("m1 completed implementation class c1");
	}
	@Override
	public void m2() {
		System.out.println("m2 completed implementation class c1");
	}
}
public class One_implementation {
	public static void main(String[]args) {
		C1 c1=new C1();
		c1.m1();
		c1.m2();
	}
}
