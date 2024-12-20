package array;

public class allUniqueElements {
public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};
	for(int i=0;i<a.length;i++) {
		boolean isUnique=true;
		for(int j=0;j<a.length;j++) {
			if(i!=j&& a[i]==a[j]) {isUnique=false; break;}
		}
		if(isUnique)System.out.println(a[i]+" ");
	}
}

}
