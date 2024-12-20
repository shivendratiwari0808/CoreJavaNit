package mock_prepration;
class A{
	public void m1() {
		System.out.println("m1 method executed");
	}
	public void m2() {
		System.out.println("m2 method executed ");
	}
}
class B extends A{ // is a relation 
	public void m3() {
		System.out.println("m3 method is executed");
	}
	public void m4() {
		System.out.println("m4 method is executed");
	}
}
public class ISA_HasA_relation {
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}
	
}
class A{
	public void m1() {
		System.out.println("m1 method executed");
	}
	public void m2() {
		System.out.println("m2 method executed ");
	}
}
class B {
	A a;
	public void m3() {
		a.m1(); // has a relation
		System.out.println("m3 method is executed");
	}
	public void m4() {
		System.out.println("m4 method is executed");
	}
}