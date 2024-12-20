package mulitiTherading;
/*Ques - 1
===========
Write a Java program that demonstrates the use of multithreading by printing different ranges of numbers using different methods in different classes, each extending the Thread class. Each number printed should include the name of the thread that is printing it.

Requirements:
Create three classes: PrintRange1To10, PrintRange11To20, and PrintRange21To30, each extending the Thread class.
Each class should override the run() method to print a specific range of numbers:
PrintRange1To10: Print numbers from 1 to 10.
PrintRange11To20: Print numbers from 11 to 20.
PrintRange21To30: Print numbers from 21 to 30.
Each printed number should be prefixed with the thread's name.
Create a main class MultiThreadedRangePrinter that initializes and starts these threads.
*/

class PrintRange1To10 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class PrintRange11To20 extends Thread{
	@Override
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class PrintRange21To30 extends Thread{
	@Override
	public void run() {
		for(int i=21;i<=30;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class MultithreadedRangePrinter {
public static void main(String[] args) {
	PrintRange1To10 p1=new PrintRange1To10();
	p1.start();
	PrintRange11To20 p2=new PrintRange11To20();
	p2.start();
	PrintRange21To30 p3= new PrintRange21To30();
	p3.start();
}
}
