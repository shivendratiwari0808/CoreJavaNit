package array;
import java.util.Scanner;
public class countEleMoreThenOneTime {
	public static void countElement(int []a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			int fer=0;
			if(a[i]==a[j]) {
				fer=-1;break;
			}
		}
		if(fer==-1) {
			continue;
		}
		for(int k=i+1;k<a.length;k++) {
			if(a[i]==a[k]) {
				fer++;
			}
		}
		if(fer>0) {
			count++;
		}
		System.out.println("Elements are prsent more than :"+count);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int n=scan.nextInt();
		int []a =new int [n];
		System.out.println("Enter Array Element :");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		countElement(a);
	}
}
