package mock_prepration;

import java.util.Arrays;

/*
 Que->
________________
Find nth max and nth min

 [ 5,1 ,2,3,9,13,7]
 nth min=3
 Output as : 3

[ 5,1 ,2,3,9,13,7]
 nth max=4

Output as : 5
*/
public class nthMax_nthMin {
	public static int findNthLargest(int []a,int k) {
		int min=a[0],max=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) min=a[i];
			if(max<a[i]) max=a[i];
		}
		int c=0;
		for(int i=max;i>min;i--) {
			for(int j=0;j<a.length;j++) {
			if(i==a[j]) {
				c++;
				break;
			}
		  }
			if(c==k) {
				return i;
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		int []a= {5,1 ,2,3,9,13,7};
		
		System.out.println("Nth Largest :"+findNthLargest(a,4));
		
		
		
	}
}
