package batch_35;
import java.util.Scanner;
public class Swap_Number {
	public static void swapFirstAndLast(int[]arr) {
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println("after swap :"+i+"=:"+arr[i]);
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		
	}
}
