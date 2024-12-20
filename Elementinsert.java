package mock_prepration;

import java.util.Arrays;

public class Elementinsert {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};
	int ele=100;
	int index=3;
	a=Arrays.copyOf(a, a.length+1);
	
	System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
			
		}	
		
		System.out.println(Arrays.toString(a));
		a[index]=ele;
		System.out.println(Arrays.toString(a));
}
}
