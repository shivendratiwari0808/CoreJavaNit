package array;

import java.util.Arrays;

public class IsSorted {
	public static boolean issorted(int[]a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[i+1]) {
				System.out.println();
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		System.out.println(issorted(a));
		
	}
	
}
