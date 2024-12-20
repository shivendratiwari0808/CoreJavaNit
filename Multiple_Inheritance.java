package batch_35;
interface I1{
	public void m1();
}
interface I2{
	public void m2();
}
interface I3 extends I1,I2{
	public void m3();
}
class C1 implements I3{
	@Override
	public void m1() {
		System.out.println("m1 completed implementtation class c1");
	}
	@Override
	public void m2() {
		System.out.println("m2 completed implementtation class c1");
	}
}

public class Multiple_Inheritance {
	public static void main(String []args) {
		C1 c1=new C1();
		c1.m1();
		c1.m2();
		c1.m3();
	}
}
