	class Reverse{
		public static void main(String[]args)
		{
			int nr=5,nc=8,r,c,a;
			for(r=1;r<=nr;r++)
			{
				for(a=nc,c=1;c<=nc;c++)
				{
					if(r%2==0)
					{
					System.out.print(a--);
					System.out.print(" ");
					}
					else
					{
					System.out.print(c);
					System.out.print(" ");
					}
				
					
				}
				System.out.println();
			}
		}
	}