/*Q. 12 Write a program to
input a number and evaluate the results based on the number entered by the
user:

(a) Natural logarithm of the number

(b) Absolute value of the number

(c) Square root of the number

(d) Cube of the number

(e) Random numbers between 0 (zero) and 1 (one).

 
*/

	
import java.math.*;	
import java.util.Scanner;

 	class Evaluate{
	
	public void calculate(double num){
	NaturalLogarithm(num);
	AbsoluteNumber(num);
	SquareRoot(num);
	Cube(num);
	RandomNumber();
	}

	void NaturalLogarithm(double num){
	System.out.println("Natural logarithm of the number :"+num+ " = "+Math.log(num));
        
	}
	void AbsoluteNumber(double num){
	System.out.println(" Absolute value of the number :" +num+ " = "+Math.abs(num));
	}
	void SquareRoot(double num){
	System.out.println("Square root of the number :"+num+ " = "+Math.sqrt(num));
	}
	void Cube(double num){
	System.out.println("Cube of the number :"+num+ " = "+Math.cbrt(num));
	}
	void RandomNumber(){
	System.out.println("Random numbers between 0 (zero) and 1 (one) :"+(Math.random()));
	}
	

	public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the evaluate number :");
	double num1=sc.nextDouble();
	
	Evaluate result=new Evaluate();
	
	result.calculate(num1);

	}

}

