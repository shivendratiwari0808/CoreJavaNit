/* Q.4 A person is paid ₹350
for each day he works and fined ₹30 for each day he remains absent. Write a
program to calculate and display his monthly income, if he is present for 25
days and remains absent for 5 days. */



    import java.util.Scanner;

	class Person{
	public static void main(String[]args){
	
		
	Scanner sc=new Scanner (System.in);
	System.out.println("enter person name ");
	String name=sc.nextLine();
	System.out.println("enter present day ");
	int day=sc.nextInt();
	System.out.println();

	int absent=30-day;
	int total=(day*350)-(absent*30);
	System.out.println("person name "+name);
	System.out.println("person monthly income is :"+total);


	
	   }
}
	
	
	
	
	