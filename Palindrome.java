/*
Write the method with the following specifications: 

Name of method : isPalindrome()
     Modifiers : public, static
   return type : boolean
      Argument : one argument of type integer

This method accepts an integer value as argument and 
return true if the given number is palindrome, else retrun false.
 */





	class Palindrome{
		public static void main(String[]args){
		int num=121,sum=0,rev;
			
		while(num!=0)
		{

		rev=num%10;
		sum=sum*10+rev;
		num=num/10;
		}
					
		System.out.println("palindrome : "+sum);
	}

}























