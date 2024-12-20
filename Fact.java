/*
4. Find factorial of Number number by using for loop.
input
:5
output
:120. */




class Fact{

public static void main(String[]args){

int fact=1,i;

for(i=5;i>0;i--)
{
fact=fact*i;
}
System.out.println("factorieal is : "+fact);
}
}