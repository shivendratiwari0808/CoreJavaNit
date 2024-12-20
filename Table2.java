/* 3. Write a Java program to print multiplication table from 2 to 5 by using for loop?
input : 5.
output :-
*/



class Table2{


	public static void main(String[]args){
	int i,j;
	for(i=2;i<=5;i++)
	{
	    for(j=1;j<=10;j++)
		{
			System.out.println(i+"x"+j+"="+i*j);
		
		}
	System.out.println();
	}	

	}
}