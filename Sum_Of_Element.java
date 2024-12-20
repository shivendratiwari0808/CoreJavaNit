package array;
import java.util.Scanner;
public class Sum_Of_Element {
	public static void calculateSumOfArray(int []a) {
		int sum=0;
		for(int y:a) {
			sum+=y;
		}
		System.out.println("sum of element :"+sum);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of Array :");
		int n=scan.nextInt();
		int[]a=new int [n];
		System.out.println("Enter the Array element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		calculateSumOfArray(a);
	}

}
