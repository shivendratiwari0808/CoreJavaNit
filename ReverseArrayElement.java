package array;
import java.util.Scanner;
public class ReverseArrayElement {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array size :");
		int n=scan.nextInt();
		int a[]=new int [n];
		System.out.println("Enter Array "+n+" Element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("before reverse :");
		for(int x:a) {
			System.out.println(x+" ");
		}
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println();
		System.out.println("after reverse Array :");
		for(int x:a) {
			System.out.println(x+" ");
		}

	}

}
