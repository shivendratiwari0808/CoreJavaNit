package array;

import java.util.Arrays;

public class Running_sum {
	public static int [] runnings_Sum(int []a) {
		int []res=new int [a.length];
		res[0]=a[0];
		for(int i=1;i<a.length;i++) {
			res[i]=res[i-1]+a[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int []a= {1,1,1};
		System.out.println(Arrays.toString(a));
		int []res=runnings_Sum(a);
		System.out.println(Arrays.toString(res));
	}
}
