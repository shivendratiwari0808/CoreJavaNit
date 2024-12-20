/* 3. WAP to store a character, check and display whether it is uppercase letter
or lowercase letter or a digit.Display teh character alongwith suitable message.
[Take a parametrized method which takes input of charcter and performs above
task] */




class Character
{
	public static void main(String[]args){
	char ch='@';
	

		if(ch>'a' && ch<'z')
		{
		System.out.println("it is lower case");
		}
		else if(ch>'A' && ch<'Z')
		{
			System.out.println("it is upper case");
		}
		else if (ch>48 && ch<57)
		{
			System.out.println("it is digit");
		}
		else
		{
			System.out.println("it is special character");
		}
	}

	
}
