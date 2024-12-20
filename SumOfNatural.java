/*  2. Write a Java program to find sum of n natural number by using for loop?
input : n = 10.
output
:sum is 55.
*/






class SumOfNatural{

	public static void main(String[]args){

	int n=10,i,sum=0;
	for(i=0;i<=n;i++)
	{
	sum+=i;
	}
	System.out.println("sum is : "+sum);
	}

}

