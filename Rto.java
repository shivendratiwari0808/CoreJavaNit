package functionalinterface;
import java.util.function.*;
public class Rto {

	public static void main(String[] args) {
	Predicate <Integer> p1=(age)-> age>=18;
	System.out.println("person is eligible :"+p1.test(19));
	System.out.println("person is eligible :"+p1.test(12));

	}

}
