package array;

import java.util.Arrays;

public class FirstNonRepeting {
	public static int non_repeting(int []a) {
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
			if(c==1) {
				return a[i];
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int []a= {-1,2,-1,3};
		System.out.println(Arrays.toString(a));
		non_repeting(a);

	}

}
