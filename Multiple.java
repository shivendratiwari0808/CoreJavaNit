package wrapperClass;

public class Multiple {
	public static void m1(int a) {
		System.out.println("single parameter");
	}
	public static void m1(int ...a) {
		System.out.println("var args parameter ");
	}
	public static void main(String[] args) {
		m1();
	}
}
