package array;

import java.util.Arrays;

public class CountSmallerElement {
	public static int[] countSmallerEle(int []a) {
		int []res= new int [a.length];
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i!=j && a[j]<a[i])count++;
			}
			res[i]=count;
		}
		return res;
	}
	public static void main(String[] args) {
		int []a= {5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		int []res=countSmallerEle(a);
		System.out.println(Arrays.toString(res));
	}
}
