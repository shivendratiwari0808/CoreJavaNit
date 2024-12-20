package collection;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
public class ListIterators {
	public static void displayElements(List<Integer> a) {
		ListIterator <Integer> i = a.listIterator();
		System.out.print("Elements traversed in forword direction :");
		while(i.hasNext()) {
			Integer obj = i.next();
			int num=obj;
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.print("Elements traversed in backword direction :");
		while(i.hasPrevious()) {
			Integer obj=i.previous();
			int num=obj;
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(12);
		num.add(30);
		num.add(90);
		System.out.println("Elements Stored :"+num);
		displayElements(num);
	}

}
