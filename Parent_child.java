package constructor;
class Parent{
	String name;
	int roll;
	Parent(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
}
class child extends Parent{
	int age;
	String clas;
	child(String name,int roll,int age,String clas){
		super(name,roll);
		this.age=age;
		this.clas=clas;
	}
}
public class Parent_child {
	public static void main(String[] args) {
		child c1=new child("shivendra",101,23,"ten");
		
		System.out.println(c1.name);
		System.out.println(c1.roll);
		System.out.println(c1.age);
		System.out.println(c1.clas);
	}
}
