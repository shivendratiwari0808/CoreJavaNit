package functionalinterface;
import java.util.Scanner;
@FunctionalInterface
interface Test{
	void add(int a, int b);
	
}
public class Add_TwoNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=scan.nextInt();
		System.out.println("Enter second number :");
		int num2=scan.nextInt();
		Test t1=(a,b)->{System.out.println("Sum of "+a+" and "+b+" :"+(a+b));};
		t1.add(num1, num2);
	}
}
