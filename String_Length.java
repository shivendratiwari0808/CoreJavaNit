package functionalinterface;
@FunctionalInterface
interface Sample{
	public int getLength(String str);
}
public class String_Length {
	public static void main(String[] args) {
		Sample s1=(str)->{return str.length();
		};
		int length=s1.getLength("shivendra");
		System.out.println(length);
	}
	
}
