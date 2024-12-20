package array;
import java.util.Scanner;
public class modifyArrayElement {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Size :");
	int num=scan.nextInt();
	int a[]=new int [num];
	System.out.println("Enter "+num+"Elements");
	for(int i=0;i<num;i++) {
		a[i]=scan.nextInt();
	}
	System.out.println("enter old element :");
	int oldEle=scan.nextInt();
	System.out.println("Enter new element :");
	int newEle=scan.nextInt();
	for(int i=0;i<num;i++) {
		if(a[i]==oldEle) a[i]=newEle;
	}
	System.out.println("Array Modification :");
	for(int i=0;i<num;i++) {
		System.out.println(a[i]+" ");
	}
	
}
}
