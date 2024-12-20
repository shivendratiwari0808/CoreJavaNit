class Reverse1{
 
 public static int reverseDigits(int num){
	int rev=0;

	while(num>0)
	{
	rev=rev*10+num%10;
	num=num/10;
	}
  return rev;
}
public static void main(String[]args){
int num=654321;
System.out.println("reverse of no is : "+reverseDigits(num));
}
}