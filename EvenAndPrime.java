package functionalinterface;
import java.util.function.Predicate;
public class EvenAndPrime {
	public static void main(String[] args) {
		Predicate<Integer> p1=num -> num%2==0;
		System.out.println("Is even ? :"+p1.test(25));
		
		Predicate <Integer> p2=num -> num/num/1==0;
		System.out.println("is prime :"+p2.test(13));

	}

}
 