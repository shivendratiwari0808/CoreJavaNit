package array;
import java.util.Scanner;
public class Find_min_max {
	public static void print_min_max(int []a) {
		int min=a[0];
		int max=a[0];
		for(int x:a) {
			if(x<min) {
				min=x;
			}
			else {
				max=x;
			}
		}
		System.out.println("minimum value of array :"+min);
		System.out.println("maxiumum value of array :"+max);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int n=scan.nextInt();
		int a[]=new int [n];
		System.out.println("enter the array element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		print_min_max(a);
	}
}
