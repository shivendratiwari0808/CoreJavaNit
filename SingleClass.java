package batch_35;

interface I1 {
	public void m1();
}
interface I2 extends I1{
	public void m2();
}
interface I3 extends I2{
	public void m3();
}
class Test implements I3{
	@Override
	public void m1() {
		System.out.println("m1 implementation class");
	}
	@Override
	public void m2() {
		System.out.println("m2 implementation class");
	}
	@Override
	public void m3() {
		System.out.println("m3 implementation class");
	}
}
public class SingleClass {
	public static void main(String[]args) {
		Test t1=new Test();
		t1.m1();
		t1.m2();
		t1.m3();
	}
}
