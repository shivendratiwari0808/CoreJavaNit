package functionalinterface;
import java.util.function.Function;
public class FindCube {
public static void main(String[] args) {
	Function <Integer,Integer> p1=(num)-> num*num*num;
	System.out.println("cube is :"+p1.apply(25));
	System.out.println("cube is :"+p1.apply(100));
}
}
