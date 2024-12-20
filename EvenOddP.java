class EvenOddP{
		public static void main(String[]args)
		{
			int nr=5,nc=8,r,c,e=2,o=1;
			for(r=1;r<=nr;r++)
			{
				for(c=1;c<=nc;c++)
				{
					if(r%2==0)
					{
					System.out.print(e);
					e+=2;
					System.out.print(" ");
					}
					else
					{
					System.out.print(o);
					o+=2;
					System.out.print(" ");
					}
				
					
				}
				System.out.println();
			}
		}
	}