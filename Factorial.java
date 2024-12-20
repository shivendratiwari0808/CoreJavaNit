/* Write a Java program to calculate the factorial of a given number.(Number must be taken from Scanner class).generate BLC and ELC classes.

specifications:

Method name: calculateFactorial
Modifiers: public, static
Return type: long
Arguments: one argument of type int

if the given value is negative, return -1.
if the given value is 0, return -2


*/



  class Factorial{
		
	public static void main(String[]args){
	long num=5;
	long fact=1;
	
	for(int i=5;i>=1;i--)
	fact=fact*i;
	{
	System.out.println("factorial is : "+fact);
	}
}	
}