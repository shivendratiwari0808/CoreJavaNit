package batch_35;

class Uidai{
	private String name;
	private long adhaarNum;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAdhaarNum(long adhaarNum){
		this.adhaarNum=adhaarNum;
	}
	public void setAge(int age) {
		if(age>18) {
			this.age=age;
		}
		else {
			System.err.println("go back under age");
		}
	}
	public String getName() {
		return name;
	} 
	public long getAdhaarNum() {
		return adhaarNum;
	}
	public int getAge() {
		return age;
	}
}
public class Setter_Getter {

	public static void main(String[] args) {
	
		Uidai person=new Uidai();
		person.setName("shivendra");
		person.setAdhaarNum(1234567);
		person.setAge(21);
		
		System.out.println("aadhar name :"+person.getName());
		System.out.println("aadhar number :"+person.getAdhaarNum());
		System.out.println("age :"+person.getAge());
		
		person.getName();
		person.getAdhaarNum();
		person.getAge();
	}

}
