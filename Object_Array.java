package array;
import java.util.Arrays;
class Student {
	private int id;
	private String name;
	private int age;
	
	public Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj==this)
			return true;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return this.id==s.id && this.name.equals(s.name)&& this.age==s.age;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	 }
}
	class StudentManeger{
		private Student[] students;
		private int capicity;
		private int size=0;
		
		public StudentManeger(int capicity) {
			this.capicity=capicity;
			students = new Student[capicity];
		}
		public int capicity() {
			return capicity;
		}
		public int size() {
			return size;
		}
		public void addStudent(Student stu) {
			if(size<capicity) {
				students[size++]=stu;
			}else {
				System.out.println("students array is full");
			}
		}
		public void displayStudents() {
			for(int i=0;i<size;i++) {
				System.out.println(students[i]);
			}
		}
		public Student getStudentById(int id) {
			for(int i=0;i<=size;i++) {
				if(students[i]!=null && students[i].getId()==id) {
					return students[i];
				}
			}
			return null;
		}
		public Student getStudentByIndex(int index) {
			if(index<0 || index>capicity) {
				return null;
			}
			return students[index];
		}
		@Override
		public String toString() {
			return "StudentManager [students=" + Arrays.toString(students) + "]";
		}
		public void removeStudent(int id) {
			for(int i=0;i<size;i++) {
				if(students[i].getId()==id) {
					for(int j=i;j<size-1;j++) {
						students[j]=students[j+1];
					}
					size--;
					students[size]=null;
				}
			}
		}
		public void clear() {
			students=new Student[capicity];
			size=0;
		}
	}
	

public class Object_Array {
	public static void main(String[] args) {
		StudentManeger sm = new StudentManeger(10);
		sm.addStudent(new Student(101,"ram",16));
		System.out.println("capicity :"+sm.capicity());
		System.out.println("size :"+sm.size());
		sm.addStudent(new Student(102, "Raaj", 23));
		sm.addStudent(new Student(103, "Ajay", 24));
		sm.addStudent(new Student(102, "Pooja", 22));
		sm.addStudent(new Student(105, "Alice", 21));
		sm.addStudent(new Student(106, "John", 20));
		sm.addStudent(new Student(102, "Ruby", 28));
		sm.addStudent(new Student(108, "Bob", 21));
		sm.addStudent(new Student(109, "Vijay", 22));
		sm.addStudent(new Student(110, "Sonu", 26));
		
		System.out.println(sm);
		
		System.out.println("capicity :"+sm.capicity());
		System.out.println("size :"+sm.size());
		
		sm.addStudent(new Student(111,"sunil",28));
		sm.displayStudents();
		
		System.out.println();
		sm.removeStudent(102);
		sm.displayStudents();
		System.out.println("Total size :"+sm.size());
		
		System.out.println(sm);
		
	}
}
