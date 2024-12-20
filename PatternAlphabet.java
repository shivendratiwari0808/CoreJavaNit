	class Random{
		public static void main(String[]args)
		{
		int nr=10,nc=10,r,c,a=1;
		for(r=1;r<=nr;r++)
		{	
			for(c=1;c<=nc;c++)
			{
				if(c==1 || c==nc || r==1)
				{
				System.out.print(a++ + " ");
		
				}
				else
				{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}


	        }
}