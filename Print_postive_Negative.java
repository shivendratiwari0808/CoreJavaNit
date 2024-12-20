package array;

import java.util.Arrays;

public class Print_postive_Negative {

	public static  suffle_pos_neg(int []a) {
		int []res=new int[a.length];
		int index=0;
		int pos=0;
		int neg=0;
		while(index<res.length) {
			while(neg<a.length) {
				if(a[neg]<0) {
					res[index++]=a[neg++];
				}
				neg++;
			}
			while(pos<a.length) {
				if(a[pos]>0) {
					res[index++]=a[pos++];
					break;
				}
				
			}
			pos++;
		}
	
	}
	public static void main(String[] args) {
		int []a={1,2,3,-4,-1,4};
		System.out.println(Arrays.toString(a));
		
		int []res =suffle_pos_neg(a);
		System.out.println(Arrays.toString(res);
	}
}
