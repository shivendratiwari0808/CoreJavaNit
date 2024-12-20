package mulitiTherading;
/*Ques - 2
-------------
Write a Java program that demonstrates the use of multithreading by printing different ranges of numbers using different methods in different classes, each extending the Thread class. Each number printed should include the name of the thread that is printing it.

Requirements:
Create three classes: PrintEven1To50, PrintPrime1To50 each extending the Thread class.
Each class should override the run() method to print a specific range of numbers:
PrintEven1To50: Print numbers from 1 to 50.
PrintPrime1To50: Print numbers from 1 to 50.
Make sure after printing all the sequence of any number print the next sequence (by using sleep method).
Each printed number should be prefixed with the thread's name.
Create a main class MultiThreadedRangePrinter that initializes and starts these threads.
Output :
*/
class PrintEven1to50 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println("even :"+i);
			}
		}
	}
}
class printPrime1To50 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			int count=0;
			for(int k=1;k<=i;k++) {
				if(i%k==0) {
					count++;
			}
			}
				if(count==2) {
					System.out.println("prime :"+i);
				}
			}
		}
	}

public class MultithreadedRangePrinter1 {
public static void main(String[] args) {
	PrintEven1to50 p1 = new PrintEven1to50();
	p1.start();
	printPrime1To50 p2= new printPrime1To50();
	p2.start();
}
}
