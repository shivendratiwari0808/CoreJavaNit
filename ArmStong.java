/* Q2. Write a program for the below requirement.
Create a method which takes an integer as input and displays whether it is Armstrong number or not */



class ArmStrong{

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
	if(num==sum)
	{
	System.out.println("this is armstrong number"+sum);
	}
	else{
	System.out.println("not a armstrong number"+sum);
	}
}
}
