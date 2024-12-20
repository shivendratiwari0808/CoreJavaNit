import java.util.Scanner;

   public class CollegeSem{
	
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	College show = new College();


	
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
	
	show.studentDetails(name);
	show.physics(physics);
	show.chemistry(chemistry);
	show.math(math);
	show.biology(biology);
	show.hindi(hindi);
	show.english(english);
	show.calculate();
	show.display();
	
	}
}
	
