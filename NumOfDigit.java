/*  5. Write a java program to count the number of digit and it's sum of the given number . 
input 12345
output 
no. of digit = 5.
sum of digit = 15. */




class NumOfDigit{

	public static void main(String[]args){
	int num=12345,sum=0,count=0,i=0;
	while(i<num)
	{
	int rem=num%10;
	sum=sum+rem;
	count++;
	num=num/10;
	}
	System.out.println("number of digits : " +count);
	System.out.println("sum of digit : "+sum);
}
}