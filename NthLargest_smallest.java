package mock_prepration;

public class NthLargest_smallest {
	public static void nthArray(int []a,int target) {
		int count=1;
		for(int i=0;i<a.length;i++) {
			int temp;
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					
				}
			}
		}
	}
	}
