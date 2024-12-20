package array;
import java.util.Scanner;
public class Find_Middle_Element {
	public static void Middle_Element(int []a) {
		if(a.length%2==0) {
			System.out.println("Middle Array :"+a[a.length/2-1]+" "+a[a.length/2]);
		}
		else {
			System.out.println("Middle Array :"+a[a.length/2]);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array size ");
		int n=scan.nextInt();
		int []a=new int[n];
		System.out.println("Enter the Element "+n+" Array :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		Find_Middle_Element.Middle_Element(a);
	}

}
