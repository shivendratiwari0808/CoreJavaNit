package batch_35;
import java.util.Scanner;
public class Middle_Array {
	public static void findMiddleElement(int[]arr) {
		if(arr.length%2==0) {
			System.out.println("middle array :"+arr[arr.length/2]+" "+arr[arr.length/2-1]);
		}
		else {
			System.out.println("middle array :"+arr[arr.length/2]);
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the Element of Array :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		findMiddleElement(arr);
	}
}
