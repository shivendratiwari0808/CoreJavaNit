package functionalinterface;
import java.util.function.Supplier;
public class Supplier {
	public static void main(String[] args) {
		Supplier <String>supplier = ()->"shivendra tiwari";
		System.out.println(supplier.get());

	}

}
