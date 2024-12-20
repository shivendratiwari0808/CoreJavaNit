package functionalinterface;

import java.util.function.Predicate;

public class CheckEven {

	public static void main(String[] args) {
		Predicate<Integer> p1=num-> num%2==0;
		System.out.println("number is Even :"+p1.test(100));
		System.out.println("number is even :"+p1.test(101));

	}

}
