package array;
import java.util.Scanner;
public class PrintEvenOdd {
	public static void print_Even_Odd_Number(int []a) {
		int even;
		int odd;
		System.out.println("\n Even Number :");
		for(int x:a) {
			if(x%2==0) {
				System.out.println(x+" ");
			}
		}
		System.out.println("\n odd Number :");
		for(int x:a) {
			if(x%2!=0) {
				System.out.println(x+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size between 1 to 100");
		int n=scan.nextInt();
		int []a=new int[n];
		System.out.println("enter the array element :");
		for(int i=0;i<a.length;i++) {
			System.out.println("index of :"+i);
			a[i]=scan.nextInt();
		}
		print_Even_Odd_Number(a);
	}

}
