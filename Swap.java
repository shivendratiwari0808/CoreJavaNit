package array;
import java.util.Scanner;
public class Swap {
	public static void SwapFirstAndLast(int []a) {
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("After Swap :"+i+"=:"+a[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n=scan.nextInt();
		int []a=new int [n];
		System.out.println("Enter the Element "+n+" Array");
		for(int i=0;i<a.length;i++) {
			System.out.println("index of :"+i+"=:"+a[i]);
			a[i]=scan.nextInt();
		}
		SwapFirstAndLast(a);
	}
}
