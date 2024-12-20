/* Q.1 Suppose you want to
display your bio-data on the output screen. Write a program in Java to perform
the task in the given format:

Name:

Father's Name:

Date of birth:

Blood Group:

Aadhar Card No.:

State:

*/


import java.util.Scanner;
	public class BioData{

	public static void main(String[]args){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name :");
	String name=sc.nextLine();
	System.out.println("Enter your father name :");
	String fname=sc.nextLine();
	System.out.println("enter your date of birth :");
	String dob=sc.nextLine();
	System.out.println("enter your blood group :");
	String blood=sc.nextLine();
	System.out.println("enter your aadhar number :");
	long num=sc.nextLong();	
	System.out.println("enter your state :");
	String state=sc.next();

	System.out.println("Name :"+name);
	System.out.println("Father's Name :"+fname);
	System.out.println("Date Of Birth :"+dob);
	System.out.println("Blood group :"+blood);
	System.out.println("Adhar Card No. :"+num);
	System.out.println("State :"+state);
	
  } 
 	
}
	
	

	


