package functionalinterface;
import java.util.Scanner;
import java.util.function.Function;
public class StringToInteger {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String :");
		String st=scan.nextLine();
		Function <String,Integer> f1= str -> str.length();
		System.out.println("String size is :"+f1.apply(st));
		
		Function <String,String> f2=str-> str.toUpperCase();
		System.out.println("String in Upeer case :"+f2.apply(st));
		
		Function <String,String> f3=str-> str.toLowerCase();
		System.out.println("String in Lower case :"+f3.apply(st));
	}
}
