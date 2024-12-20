/*

* * * * *
*       *
*       *
*       *
*       *
* * * * *

*/


class Pattern{
	
	public static void main(String[]args){
	
	int  row=6, col=5;
	
	for(int r=1;r<=row;r++)
	{
		for(int c=1;c<=col;c++){
		
		if(r==1 || c==1 || c==5 || r==6){
			
			System.out.print("* ");
			}
			else{
			System.out.print("  ");
			}	
		}
		System.out.println();
	}
	
	}	
}