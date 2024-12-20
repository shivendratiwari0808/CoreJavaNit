package batch_35;
interface I1{
	public void m1();
}
interface I2 extends I1{
	public void m2();
}
interface I3 extends I1{
	public void m3();
}
class Test implements I2{
	@Override
	public void m1() {
		System.out.println("m1 completed implementaton class c1");
	}
	@Override
	public void m2() {
		System.out.println("m2 completed implementation class c1");
	}
	@Override
	public void m3() {
		System.out.println("m3 completed implementattion class c1");
	}
}
class Test1 implements I3{
	@Override
	public void m1();
	@Override
	public void m3();
	
}
public class Implement_Class {
	public static void main(String[]args) {
		Test t1=new Test();
		Test1 t2=new Test1();
		t1.m1();
		t1.m2();
		t1.m3();
		t2.m1();
		t2.m3();
		
	}
}
