package lab_practice;

class Tester{
	String name;
	int age;
	char grade;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	public char getGrade() {
		return grade;
	}
}
public class Student {
	public static void main(String[] args) {
		Tester t1=new Tester();
		t1.setName("shivendra");
		t1.setAge(21);
		t1.setGrade('c');

		System.out.println("Student name is :"+t1.getName());
		System.out.println("Student age is :"+t1.getAge());
		System.out.println("Student grade is :"+t1.getGrade());
	}
}

