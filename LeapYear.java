/* 4.Write a program to input year and check whether it is:
(a) a Leap year (b) a Century Leap year (c) a Century year but not a Leap year
Century years are NOT leap years UNLESS they can be evenly divided by 400.
(For example, 1700, 1800, and 1900 were not leap years, but 1600 and 2000,
which are divisible by 400, were.)
Sample Input: 2000
Sample Output: It is a Century Leap Year. */



class LeapYear
{
	public static void main(String[] args)
	{
		int year=2003;
		
		if(year%4==0 && year%100!=0)
		{
		System.out.println("it is leap year");
		}
		else if(year%4==0 && year%400==0)
		{
		System.out.println("century leap year");
		}
		else if(year%100==0)
		{
		System.out.println("century year but not a leap year");
		}
		else
		{
		System.out.println("not a leap year");
		}
	}


}