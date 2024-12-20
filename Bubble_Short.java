package array;
import java.util.Scanner;
public class Bubble_Short {
	public static void bubble_shorting(int []a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
			}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size between 1 to 100");
		int n=scan.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the Element "+n+" Array");
			for(int i=0;i<a.length;i++) {
				a[i]=scan.nextInt();
			}
			bubble_shorting(a);
		}

}
