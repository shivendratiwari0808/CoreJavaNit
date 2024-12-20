/* Q.9 Write a program to
input two unequal numbers. Display the numbers after swapping their values in
the variables without using a third variable.

Sample Input: a = 23, b = 56

Sample Output: a = 56, b = 23

*/



import java.util.Scanner;

	class SwapNumber{
	
	int a,b;	
	public void swaping(){
	
	a = a + b;
	b = a - b;
	a = a - b;
	
	}
	
	public void display(){
	
	System.out.println("before swap the a number : "+a);
	System.out.println("before swap the b number : "+b);
	
	
	}
	
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	
	SwapNumber show=new SwapNumber();
	
	
	System.out.println("enter a value :");
	show.a =sc.nextInt();
	System.out.println("enter b value :");
	show.b =sc.nextInt();
	
	show.swaping();
	show.display();
	

	}
	
 
}