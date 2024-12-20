/* Q.5 In a competitive
examination, there were 150 questions. One candidate got 80% correct and the
other candidate 72% correct. Write a program to calculate and display the
correct answers each candidate got. */



   import java.util.Scanner;
	class Examination
	{
	public static void main(String[]args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter candidate name : ");
	String name=sc.nextLine();
	System.out.println("enter percentage :");
	int per=sc.nextInt();
	

	int total=(150*per)/100;
	
	
	System.out.println("candidate name "+name);
	
	System.out.println("student correct answer :"+total);
}
}

	