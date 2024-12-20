/* Q3.

Write a program to input three numbers and check whether they are equal or not. If they are unequal numbers then display the greatest among them otherwise, display the message 'All the numbers are equal'.

Sample Input: 34, 87, 61

Sample Output: Greatest number: 87

Sample Input: 81, 81, 81

Sample Output: All the numbers are equal.*/



class GreatestNum{


	public static void main(String[]args){
	int a=87,b=87,c=87;
	if(a==b && a==c){
	System.out.println("both are equal");
	}
	else if(a>b && a>c){
	System.out.println("a is big ");
	}
	else if(a==b && a<c){
	System.out.println("a and b are equal");
	}
	else if(b>c ){
	System.out.println("b is big");
	}
	else{
	System.out.println("c is big");
	}
}
}

