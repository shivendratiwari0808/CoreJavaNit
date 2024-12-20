package lab_practice;

@FunctionalInterface
interface NumberTest{
	void display(int num);
	
}
public class NumberTester {
	public static void main(String[]args) {
	NumberTest c1=(num)->{System.out.println("is "+num+"even ?");};
	}
}
