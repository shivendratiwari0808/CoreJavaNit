package array;
import java.util.Scanner;
public class Find_Median {
	public static void PrintMedian(int []a) {
		if(a.length%2==0) {
			System.out.println("median is :"+a[a.length/2-1]+" "+(a[a.length/2]));
		}
		else {
			System.out.println("median is :"+a[a.length/2]);
		}
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	int n=scan.nextInt();
	int []a=new int [n];
	System.out.println("Enter the Element :");
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	PrintMedian(a);
}
}
