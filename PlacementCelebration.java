/* Q.2 Write a program by
using a class 'Placement_Celebration' without any data members but having only
functions as per the specifications given below:

class name : 'Placement Celebration’

void display1( ): To print venue, place and
reporting time.

void display2( ): To print number of students,
friends of students and parents accompanying .

Write a main class to create an object of the
class 'Picnic' and call the functions display1() and display2( ). */



import java.util.Scanner;
   class PlacementCelebration
{	
	String vanue,place,time;
	int numOfStudent,friendOfStuent,studentParent;
		public void display1()
		{
		System.out.println("My Vanue :"+vanue);
		System.out.println("Function place :"+place);
		System.out.println("Reporting Time :"+time);
		}
		public void display2(){
		System.out.println("Number of Student :"+numOfStudent);
		System.out.println("friend of student "+friendOfStuent);
		System.out.println("Student parents :"+studentParent);
		}
	public static void main(String []args){
	
	PlacementCelebration pinic=new PlacementCelebration();
	
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("vanue is ");
	pinic.vanue=sc.nextLine();
	System.out.println("Function place");
	pinic.place=sc.nextLine();
	System.out.println("reporting time");	
	pinic.time=sc.nextLine();

	System.out.println("number of Studnts :");
	pinic.numOfStudent=sc.nextInt();
	System.out.println("friend of tudent :");
	pinic.friendOfStuent=sc.nextInt();
	System.out.println("Student parent :");
	pinic.studentParent=sc.nextInt();
	
	
	
	pinic.display1();
	pinic.display2();
		
}
}	