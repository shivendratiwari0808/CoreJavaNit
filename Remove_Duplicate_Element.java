package array;

import java.util.Arrays;

public class Remove_Duplicate_Element {
	public static void remove_duplicate(int []a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==a[i+1] && a[i]!=0) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				i--;
				a[a.length-1]=0;
			}
		}
		System.out.println(Arrays.toString(a));

	}
	public static void main(String[] args) {
		int []a= {1,2,2,1,3,4,2};
		System.out.println(Arrays.toString(a));
		remove_duplicate(a);
		
	}

}
