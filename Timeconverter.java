/* Q.8 Write a program to
input the time in seconds. Display the time after converting them into hours,
minutes and seconds.

Sample Input: Time in seconds 5420

Sample Output: 1 Hour 30 Minutes 20 Seconds*/


import java.util.Scanner;

	class Timeconverter{
	int hours,minute,seconds,timeInSecond;
	
	public void input(){
	
	System.out.println(hours+ " Hour " + minute+ " minutes " +seconds+ " Seconds ");
	
	}
	
	public void calculate(){
	hours=timeInSecond / 3600;
	minute=(timeInSecond-3600)/60;
	seconds=(timeInSecond-3600)-(minute*60);

	}


	public static void main(String[] args){
	
	Timeconverter show=new Timeconverter();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter time in seconds :");
	show.timeInSecond=sc.nextInt();
	
	show.calculate();
	show.input();
	
	}
}