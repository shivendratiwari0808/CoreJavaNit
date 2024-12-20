/*2.Write a program to enter three numbers and a character.
Find and display sum of the numbers if the given character is ’s’ and product of
the numbers if the given character is 'p'. The program displays a message "Invalid
Character" if the user enters a letter other than 's' or 'p'.
*/



class SumOfNumber{
public static void main(String[]args){
int a=60,b=40,c=12;
int sum=a+b+c;
char ch;
int product=a*b*c;
ch='p';
if(ch=='s')
{
System.out.println(sum);
}
else if(ch=='p')
{
System.out.println(product);
}
else
{
System.out.println("invalid");
}
}
}
