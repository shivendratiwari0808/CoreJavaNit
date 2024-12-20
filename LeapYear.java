package functionalinterface;
import java.util.function.Predicate;
public class LeapYear {

	public static void main(String[] args) {
	Predicate <Integer> p1=year-> year%4==0;
	System.out.println("Leap year or not :"+p1.test(2022));
	System.out.println("Leap year or not :"+p1.test(2024));
	}

}
