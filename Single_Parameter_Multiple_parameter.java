package wrapperClass;

public class Single_Parameter_Multiple_parameter {

	public static void m1(int a) {
		System.out.println("single parameter");
	}
	public static void m1(int ...a) {
		System.out.println("multiple parameter");
	}
	public static void main(String[] args) {
		m1(10,20,30,40,50,60,70,80,90,100);
		
	}
	

}

