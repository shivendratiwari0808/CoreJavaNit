/* Q. 13 In your semester
examination, you have appeared for six subjects. Write a program in Java to
calculate the average mark obtained and finally display the marks in
rounded-off form
*/



	

 import java.util.Scanner;

    class SemsterResult{
	
	public static void main(String[]args){
	
	Semester result=new Semester();

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your Name ");
	String name=sc.nextLine();
	System.out.println("Enter your Physics marks :");
	int physics=sc.nextInt();
	System.out.println("Enter your chemistry marks :");
	int chemistry=sc.nextInt();
	System.out.println("Enter your math-matics marks :");
	int math=sc.nextInt();
	System.out.println("Enter your biology marks :");
	int biology=sc.nextInt();
	System.out.println("Enter your hindi marks :");
	int hindi=sc.nextInt();
	System.out.println("Enter your english marks :");
	int english=sc.nextInt();
	
	result.studentDetails(name);
	result.physics(physics);
	result.chemistry(chemistry);
	result.math(math);
	result.biology(biology);
	result.hindi(hindi);
	result.english(english);
	result.calculate();
	result.display();
	
	}
}
	
	