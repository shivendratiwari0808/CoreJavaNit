package batch_35;
import java.util.Scanner;
class Details{
	String name;
	long adhaarNum;
	int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAdhaarNum(long adhaarNum) {
		this.adhaarNum=adhaarNum;
	}
	public long getAdhaarNum() {
		return adhaarNum;
	}
	public void setAge(int age) {
		if(age>18) {
			this.age=age;
		}
		else {
			System.out.println("under age please notify me");
		}
		
	}
	public int getAge() {
		return age;
	}
}
public class Adhaar {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Details show=new Details();
		System.out.println("Enter your name :");
		String name=sc.nextLine();
		System.out.println("Enter your Adhaar number :");
		long AdhaarNum=sc.nextLong();
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		
		
		
		
		show.setName(name);
		show.setAdhaarNum(AdhaarNum);
		show.setAge(age);
		
		System.out.println("Name :"+show.getName());
		System.out.println("Adhaar Number :"+show.getAdhaarNum());
		System.out.println("Age :"+show.getAge());
	}
}
