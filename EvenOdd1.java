/* 
5. Print even and odd number between 1
100 seperately by using for loop?*/





class EvenOdd1{

		public static void main(String[]args){
		int n=100,i=1;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+" ");
			
		}}
               System.out.println();
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
			System.out.print(i+" ");
			
			}
		}

		
		}
}
