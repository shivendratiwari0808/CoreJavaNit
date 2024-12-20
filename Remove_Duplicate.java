package array;

import java.util.Arrays;

public class Remove_Duplicate {
	public static void removeAndDuplicate(int []a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[i+1]) {
				System.out.print(a[i]+" ");
			}
			if(i+1==a.length-1) {
				System.out.print(a[i+1]);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,7,7,8,8,9,9,4,5,6,7,8,9,};
	System.out.println(Arrays.toString(a));
	removeAndDuplicate(a);
	}

}
