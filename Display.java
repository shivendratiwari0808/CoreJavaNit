/*Q1. Write a program for the below requirement 
Create a static method 
Create a non static method 
Call both the methods from the main method */

/*   
class Display{

		public static void root()
		{

System.out.println("djnknfew");
		}
		public  void setRoot()
		{
System.out.println("lkjhg");

		}
 
public static void main(String[]args){
System.out.println("starts");
Display d =new Display();
root();
d.setRoot();
System.out.println("ends");

}
}

*/



/* Q2. Write a program for the below requirement.
Create a method which takes an integer as input and displays whether it is Armstrong number or not */



class ArmStorng{

public static void main(String[]args){

	int num=153,sum=0,count=0,i=0,mul;
	while(i<num)
	{
	int rem=num%10;
	mul=rem*rem*rem;
	sum=num+mul;
	num=num/10;
	}
	num=153;
	if(num==0)
	{
	System.out.println("this is armstrong number"+sum);
	}
	else{
	System.out.println("not a armstrong number"+sum);
	}
}
}


/*Q3 Write a program for the below requirement Create method which takes two different integers as input and display the greatest among them

Q4. Write a program for the below requirement 
Create a method to input the unit price and quantity of a product. Calculate the total cost, discount 20% if the total purchase is more than 20k Rs otherwise discount is 10% .Also find the net the price to be paid.

Q5. write a program for the below requirement 
Find the radius of a circle based on given diameter. */