package collection;

import java.util.ArrayList;
public class MainClass1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add("java");
		l.add(12.9);
		l.add(true);
		l.add('j');
		
		ArrayList  al=new ArrayList();
		al.add('A');
		al.add('Z');
		al.addAll(l);
		
		System.out.println("First Collection :"+l);
		System.out.println("Second Collection :"+al);
		System.out.println("2nd Collection contains All " + "elements of 1st "+al.containsAll(l));
		System.out.println("no of elements 1st :"+l.size());
		System.out.println("no of elements 2nd :"+al.size());
		System.out.println("12.9 available "+l.contains(12.9));

	}

}
