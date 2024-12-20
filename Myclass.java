class Myclass{
	int x=100;
	}
public class test{
	public static void main(String[]args){
	Myclass obj1=new Myclass();
	Myclass obj2=obj1;
	obj2.x=50;
	System.out.println(obj1.x);
	}
}