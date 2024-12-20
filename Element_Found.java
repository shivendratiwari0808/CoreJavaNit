package array;
import java.util.Scanner;
public class Element_Found {
	public static void elementFoundInArray(int []a,int ele) {
		int count=0;
		for(int x:a) {
			if(x==ele) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Element Found ");
		}
		else {
			System.out.println("element not found ");
		}
	} 
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n=scan.nextInt();
		int []a=new int [n];
		System.out.println("Enter the Array Element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("enter search element :");
		int ele=scan.nextInt();
		elementFoundInArray(a,ele);
	}

}
