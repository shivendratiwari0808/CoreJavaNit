/* 1)Print the following pattern

    1
    2 3
    3 4 5
    4 5 6 7
    5 6 7 8 9
*/




	class Pattern{
		public static void main (String []args){
		int n=5,i,j,k=1;
		for(i=1;i<=n;i++)
			{
			
			for(j=1;j<=i;j++)
			{
			System.out.print(i + j - k+" ");
				}
			System.out.println();

			}
	
		}
}



