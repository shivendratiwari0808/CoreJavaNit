/* 2. Write a Java program to findprime  number upto given number   by using for loop?
input : n = 10.
output :- 2,3,5,7.
*/



class PrimeNum1{

	public static void main(String[]args){
	int num=10,i,j,count=0;
	
	
	for(j=1;j<=100;j++)
	{
		num=j;
		count=0;
	     for(i=1;i<=num;i++){
		if(num%i==0){
		count++;
		}
	}
		
		
	
	if(count==2)
	{
	System.out.println(num+" ");
	}
}
}
}/