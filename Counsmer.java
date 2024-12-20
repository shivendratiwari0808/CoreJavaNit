package functionalinterface;
import java.util.function.Consumer;
public class Counsmer {
	public static void main(String[] args) {
		Consumer<Integer> consumer = num -> {System.out.println(num+" is even "+(num%2==0));};
		consumer.accept(22);

	}

}
