package array;
import java.util.Scanner;
public class checkArrayShortOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n=scan.nextInt();
		int []a=new int [n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[i+1]) {
				count++;
			}
		}
		if(count==a.length-1) {
			System.out.println("sorted Array");
		}else {
			System.out.println("not sorted Array");
		}
		
	}
}
