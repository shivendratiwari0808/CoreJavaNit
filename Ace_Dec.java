package mock_prepration;

import java.util.Arrays;

/*Que->
________________
  Sort the array In Ace and Dec order
   Input as : [ 5,1 ,2,3,9,13,7]
   In ACE
   Output as: [ 1,2,3,5,7,9,13]
   In DEC
   Output as:[13,9,7,5,3,2,1]
*/

public class Ace_Dec {
	public static void short_Array(int []a) {
		System.out.println("Intput Arrays :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]>a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Acending arrays :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Decending arrays :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int []a= {5,1,2,3,9,13,7};
		short_Array(a);
	}
	
}
