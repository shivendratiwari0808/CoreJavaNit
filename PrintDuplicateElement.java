package array;
import java.util.Scanner;
public class PrintDuplicateElement {
	public static void duplicateElement(int []a) {
		for(int i=0;i<a.length;i++) {
			int skipDuplicate=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					skipDuplicate= -1; break;
				}
			}
			if(skipDuplicate == -1) {
				continue;
			}
			for(int k=i+1;k<a.length;k++) {
				if(a[i]==a[k]) {
					skipDuplicate++;
				}
			}
			if(skipDuplicate>0) {
				System.out.println(a[i]+" ");
			}
		}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Array size :");
	int num=scan.nextInt();
	int []a=new int [num];
	System.out.println("Enter Array element :");
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	duplicateElement(a);
}
}
