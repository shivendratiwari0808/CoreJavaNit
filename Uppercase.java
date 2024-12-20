package functionalinterface;
import java.util.Scanner;
@FunctionalInterface
interface ToUppercase{
	public void convert(String str);
}
public class Uppercase {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String st=scan.nextLine();
		ToUppercase s1=(str)->{String newStr= str.toUpperCase();
		System.out.println(newStr);
		};
		s1.convert(st);

	}

}
