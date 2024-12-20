package array;
import java.util.Scanner;
public class Search_Element_Print_Index {
	public static void printIndexNo(int []a,int ele) {
		int i=0;
		for(;i<a.length;i++) {
			if(ele==a[i]) break;
		}
		if(a[i]==ele) {
			System.out.println("Element Found at index no = :"+i);
		}
		else {
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size of Array :");
		int n=scan.nextInt();
		int []a=new int [n];
		System.out.println("Enter the Element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter found Element :");
		int ele=scan.nextInt();
		printIndexNo(a,ele);
	}

}
