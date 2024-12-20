package array;

import java.util.Arrays;

public class Suffle_Repeting {
	public static int[] suffle_non_repeting(int []a) {
		int []res=new int [a.length];
		int s=0;
		int n=0;
		for(int i=0;i<a.length;i+=2) {
			res[i]=a[s++];
			res[i+1]=a[n++];
		}
		return res;
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int n=4;
		System.out.println(Arrays.toString(a));
		int []res=suffle_non_repeting(a);
		System.out.println(Arrays.toString(res));
		
	}
	
}
