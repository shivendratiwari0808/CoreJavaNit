package array;

import java.util.Arrays;

public class product_Array {
	public static int[] Multiply_Array(int[] a) {
	int []res=new int[a.length];
	for(int i=0;i<res.length;i++) {
		int mul=1;
		for(int j=0;j<a.length;j++) {
			if(i!=j) {
				mul*=a[j];
			}
		}
		res[i]=mul;
	   }
	return res;
	}
	public static void main(String[] args) {
		int []a={1,2,3,4};
		System.out.println(Arrays.toString(a));
		int[] res=Multiply_Array(a);
		System.out.println(Arrays.toString(res));
	}
}
