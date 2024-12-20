package array;

import java.util.Arrays;

public class Binary_Searching {

	public static void Binary_Search(int []a,int key) {
		int start=0 ; 
		int end=a.length-1;
		while(start<=end) {
			int midIndex=(start+end)/2;
			int mid=a[midIndex];
			if(mid==key) {
				
			}
			if(mid<key) {
				start=midIndex+1;
			}
			else {
				end=midIndex-1;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
	int []a={1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(a));
	Binary_Search(a,5);
	}
}

