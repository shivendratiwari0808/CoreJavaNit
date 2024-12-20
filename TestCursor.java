package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TestCursor {
	public static void displayEven(List<Integer> a) {
		Iterator <Integer> i = a.iterator();
		System.out.print("Even Number :");
		while(i.hasNext()) {
			Integer obj=i.next();
			int num=obj;
			if(num%2==0) {
				System.out.print(num+" ");
			}
		}
	}
	public static void main(String[] args) {
		List<Integer> num = new ArrayList <Integer>();
		num.add(11);
		num.add(12);
		num.add(30);
		num.add(90);
		System.out.println("Elements stored :"+num);
		displayEven(num);

	}

}
