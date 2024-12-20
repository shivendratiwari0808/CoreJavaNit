package batch_35;
abstract class A{
	public abstract void m1();
}
interface I1{
	public void m2();
}
class C1 extends A implements I1{
	@Override
	public void m1() {
	System.out.println("m1 completed implementation class c1");
	}
	@Override
	public void m2() {
		System.out.println("m1 completed implementation class c1");
	}
}
	
public class Abstract_class {
	public static void main(String[]args) {
		C1 c1=new C1();
		c1.m1();
		c1.m2();
	}
}
