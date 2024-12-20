package array;
import java.util.Scanner;
public class Count_Even_odd {
	public static void countEvenOddNum(int []a) {
		int even=0;
		int odd=0;
		for(int x:a) {
			if(x%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even number :"+even+"\nOdd Number :"+odd);
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array size Element :");
	int n=scan.nextInt();
	int a[]=new int [n];
	System.out.println("Enter the Array "+n+" Element");
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	countEvenOddNum(a);	

	}

}
