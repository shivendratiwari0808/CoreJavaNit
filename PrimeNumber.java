/* 1. Write a Java program to check the number is prime number or not  by using for loop?
input : - n = 5
output 5 is a prime number
*/



class PrimeNumber{

	public static void main(String[]args){
	int n=5,i,count=0;
    	for(i=1;i<=n;i++)
	{
	if(n%i==0){
		count++;
		}
	}
   if(count==2){
	System.out.println(n+" is a prime number");
	}
	else{
	System.out.println(n+" is not a prime number");
	}

	
    }


}