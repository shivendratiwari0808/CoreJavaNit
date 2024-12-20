package constructor;
class person{
	String name;
	int age;
	
	person(String name,int age){
		this.name=name;
		this.age=age;
	}
}

public class Constrictor_PassValue {
	public static void main(String[] args) {
		person p1=new person("shivendra",23);
		
		System.out.println("name :"+p1.name);
		System.out.println("age is :"+p1.age);

	}

}
